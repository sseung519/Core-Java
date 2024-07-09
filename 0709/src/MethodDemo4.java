/*
    Method를 호출하는 방법 3가지
    1. Call(Pass) by Name
    1. Call(Pass) by Value
    1. Call(Pass) by Reference
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        int result;
        MethodDemo4 md = new MethodDemo4();
        result = md.calcSum(10, 100);
        System.out.println(result);
        result = md.calcSum(1,50);
        System.out.println(result);
        result = md.calcSum(11, 109);
        System.out.println(result);
    }

    int calcSum(int start, int end) { //메소드 필수 3요소 1. 이름 2. 괄호(중괄호X) 3. 리턴 타입
        //무치형 void
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}

//Naming Convention
/*
    1. PascalCasing : Class, Interface, Enum
    2. camelCasing : variable, method
    3. Snake_Casing
    4. Kebab-Casing
 */
