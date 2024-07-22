public class OutputHandler {
    void printEmployeesInfo(Employee[] employees) {
        System.out.println("\t\t\t\t<<급여관리프로그램>>");
        System.out.println("------------------------------------------------------");
        System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
        System.out.println("------------------------------------------------------");
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            System.out.printf("%-8d%-8d%-4d%-8d%-8d%-8d%-10d%n",
                    employee.getEmpId(), employee.getGrade(), employee.getSalaryClass(),
                    employee.getExtraPay(), employee.getTotalSalary(), employee.getTax(),
                    employee.getNetAmount());
        }
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.println("입력데이타 출력");
        for (Employee employee : employees) {
            if (employee == null) {
                break;
            }
            System.out.printf("%-5d%-5d%-5d%-10d%n",
                    employee.getEmpId(), employee.getGrade(), employee.getSalaryClass(),
                    employee.getExtraPay());
        }
    }
}