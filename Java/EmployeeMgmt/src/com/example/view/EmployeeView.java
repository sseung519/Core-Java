/*
        작성자 : 박종호
        작성일 : 2024-08-01
        작성목적 : 사원관리프로그램 -
        작성환경 : Windows 10 22H2(OS Build 19045.4651),
        JDK 17.0.10
        IntelliJ IDEA 2024.1.4 (Ultimate Edition)
        */
package com.example.view;

import com.example.controller.CalcController;
import com.example.controller.InsertController;
import com.example.controller.SelectController;
import com.example.model.EmployeeDAOImpl;
import com.example.model.EmployeeVO;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private EmployeeVO e;
    private Scanner scan;
    private CalcController calc;
    private SelectController selectController;  // SelectController 필드 추가

    public EmployeeView() {
        this.scan = new Scanner(System.in);
        this.selectController = new SelectController(new EmployeeDAOImpl());  // SelectController 초기화
        boolean isContinue = true;
        while (isContinue) {
            switch (showMenu()) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    selectAllMenu();
                    break;
                case 99:
                    isContinue = false;
                    break;
                default:
                    System.out.println("잘못된 번호를 입력했음 ");
            }
            System.out.println("Program is over...");
        }
    }

    private void selectAllMenu() {
        List<EmployeeVO> list = selectController.selectAllEmployee();
        String y_n = null;
        do {
            System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야간수당\t총금액\t실수령액");
            System.out.println("------------------------------------");
            if (list == null || list.size() == 0) {
                System.out.println("등록된 사원이 없습니다.");
            } else {
                list.forEach(p -> System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
                        p.getEmpno(), p.getEname(), p.getDname(), p.getSal(),
                        p.getRsal(), p.getFsal(), p.getNsal(), p.getTotal(), p.getRealTotal())
                );
                System.out.println("나갈래요(y/n) ? : ");
                y_n = scan.next();
            }

        } while (y_n != null && y_n.equalsIgnoreCase("n"));
    }

    // 사원 입력
    private void insertMenu() {
        String i_o = null;
        do {
            System.out.println("사원 입력 메뉴");
            System.out.print("사원 번호 : ");
            String empno = scan.next();

            String ename = "";
            while (true) {
                System.out.print("사원 이름 : ");
                ename = scan.next();
                if (ename.matches("[가-힣]+")) {
                    break;
                } else {
                    System.out.println("잘못입력했어요. 다시 입력하세요");
                }
            }

            // 기본급
            int sal = 0;
            while (true) {
                System.out.print("기본급 입력 : ");
                String input = this.scan.next();
                try {
                    sal = Integer.parseInt(input);
                    if (sal >= 1 && sal <= 4) {
                        break;
                    } else {
                        System.out.println("잘못입력했어요. 다시 입력하세요");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못입력했어요. 다시 입력하세요");
                }
            }

            // 야간시간
            int nhour = 0;
            while (true) {
                System.out.print("야간시간 입력 : ");
                String input = this.scan.next();
                try {
                    nhour = Integer.parseInt(input);
                    if (nhour >= 1 && nhour <= 4) {
                        break;
                    } else {
                        System.out.println("잘못입력했어요. 다시 입력하세요");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못입력했어요. 다시 입력하세요");
                }
            }

            // 가족수
            int fcount = 0;
            while (true) {
                System.out.print("가족수 입력 : ");
                String input = this.scan.next();
                try {
                    fcount = Integer.parseInt(input);
                    if (fcount >= 1 && fcount <= 5) {
                        break;
                    } else {
                        System.out.println("잘못입력했어요. 다시 입력하세요");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못입력했어요. 다시 입력하세요");
                }
            }

            e = new EmployeeVO(empno, ename, null, sal, nhour, fcount);
            calc = new CalcController(e);  // calc 객체 초기화
            calc.calc();  // 계산 수행
            String dname = e.getDname();

            e = new EmployeeVO(empno, ename, dname, sal, nhour, fcount);
            InsertController ic = new InsertController();
            if (ic.insert(e)) {
                System.out.println("사원 등록 성공");
            } else {
                System.out.println("사원 등록 실패");
            }
            System.out.println("계속 입력하시겠습니까(i/n)? : ");
            i_o = this.scan.next();

        } while (i_o != null && i_o.equalsIgnoreCase("i"));
    }

    // 초기화면
    private int showMenu() {
        System.out.println("-----------------------------");
        System.out.println("          사원 관리             ");
        System.out.println("-----------------------------");
        System.out.println("1.사원 입력");
        System.out.println("2.사원 조회");
        System.out.println("99.종료");
        return this.scan.nextInt();
    }
}
