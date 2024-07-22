import java.util.Scanner;

public class ConditionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름:");
        String name = sc.nextLine();
        System.out.print("신장(cm):");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg):");
        double weight = sc.nextDouble();
        height = height/ 100.0;
        double bmi = weight / (height * height);
        if(bmi < 18.5) {
            System.out.println(name + "님은 BMI지수" + bmi + " 이고 저체중입니다.");
        } else if(18.5 <= bmi && bmi <= 22.9) {
            System.out.println(name + "님은 BMI지수" + bmi + " 이고 정상체중입니다.");
        } else if(23 <= bmi && bmi < 24.9) {
            System.out.println(name + "님은 BMI지수" + bmi + " 이고 비만전단계입니다.");
        } else if(25 <= bmi && bmi < 29.9) {
            System.out.println(name + "님은 BMI지수" + bmi + " 이고 1단계 비만입니다.");
        } else if(30 <= bmi && bmi < 34.9) {
            System.out.println(name + "님은 BMI지수" + bmi + " 이고 2단게 비만입니다.");
        } else {
            System.out.println(name + "님은 BMI지수" + bmi + " 이고 3단계 비만입니다.");
        }

//        switch (bmi) {
//            case bmi < 18.5: System.out.println(name + "님은 BMI지수" + bmi + " 이고 저체중입니다."); break;
//            case 18.5 <= bmi && bmi <= 22.9: System.out.println(name + "님은 BMI지수" + bmi + " 이고 정상체중입니다."); break;
//            case 23 <= bmi && bmi < 24.9: System.out.println(name + "님은 BMI지수" + bmi + " 이고 비만전단계입니다."); break;
//            case 25 <= bmi && bmi < 29.9: System.out.println(name + "님은 BMI지수" + bmi + " 이고 1단계 비만입니다."); break;
//            case 30 <= bmi && bmi < 34.9: System.out.println(name + "님은 BMI지수" + bmi + " 이고 2단게 비만입니다."); break;
//            default: System.out.println(name + "님은 BMI지수" + bmi + " 이고 3단계 비만입니다.");
//        }


//        System.out.print("Favoirte Season(spring, summer, fall, winter) : ");
//        String season = sc.nextLine();
////        switch (season) {
////            case "spring": System.out.println("봄: 개나리, 진달래"); break;
////            case "summer": System.out.println("여름: 장미, 아카시아"); break;
////            case "fall": System.out.println("가을: 백합, 코스모스"); break;
////            default : System.out.println("겨울: 동백, 미래");
////        }

        //문자열은 번지를 받기때문에 spring을 입력해도 spring과 번지와 비교하기 때문에 제대로 비교가 이루어지지 않음.
//        if(season == "spring") {
//            System.out.println("봄: 개나리, 진달래");
//        } else if(season == "summer") {
//            System.out.println("여름: 장미, 아카시아");
//        } else if(season == "fall") {
//            System.out.println("가을: 백합, 코스모스");
//        } else {
//            System.out.println("겨울: 동백, 미래");
//        }
//     if(season.equals("spring")) { //equals는 String class의 멤버 메소드이기 때문에, 주소가 필요하다. 주소는 heap에 저장
//            System.out.println("봄: 개나리, 진달래");
//        } else if(season.equals("summer")) {
//            System.out.println("여름: 장미, 아카시아");
//        } else if(season.compareTo("fall") == 0) {
//            System.out.println("가을: 백합, 코스모스");
//        } else {
//            System.out.println("겨울: 동백, 미래");
//        }

    }
}
