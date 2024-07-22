/*
    Method를 호출하는 방법 3가지
    1. Call(Pass) by Name
    1. Call(Pass) by Value
    1. Call(Pass) by Reference
 */
public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        md.calcSum(); //Call by name
    }

    void calcSum() { //메소드 필수 3요소 1. 이름 2. 괄호(중괄호X) 3. 리턴 타입
        //무치형 void
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합: " + sum);
    }
}

//Naming Convention
/*
    1. PascalCasing : Class, Interface, Enum
    2. camelCasing : variable, method
    3. Snake_Casing
    4. Kebab-Casing
 */
