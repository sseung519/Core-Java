/*
    Method를 호출하는 방법 3가지
    1. Call(Pass) by Name
    1. Call(Pass) by Value
    1. Call(Pass) by Reference
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        MethodDemo1 md = new MethodDemo1();
        md.calcSum(10, 100);
        md.calcSum(1,50);
        md.calcSum(11, 109);
    }

    void calcSum(int start, int end) { //메소드 필수 3요소 1. 이름 2. 괄호(중괄호X) 3. 리턴 타입
        //무치형 void
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(start + "부터" + end + " 까지의 합: " + sum);
    }
}

//Naming Convention
/*
    1. PascalCasing : Class, Interface, Enum
    2. camelCasing : variable, method
    3. Snake_Casing
    4. Kebab-Casing
 */
