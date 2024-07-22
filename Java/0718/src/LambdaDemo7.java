import java.util.*;

/*
 * Collection Framework와 Lambda Expression
 *
 * */
public class LambdaDemo7 {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(4,7,1,2,5,6,3,9);
        List<String> list = Arrays.asList("한강", "두만강", "낙동강", "영산강", "금강", "압록강");
        // sorting
        // 1번째 방법
        // Collections.sort(list, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer front, Integer back) {
        //         return front - back;        //오름차순
        //     }
        // });

        // 2번째 방법    lambda
        // Collections.sort(list,(front, back) -> back - front);  //내림차순      //오름차순 front - back
        // System.out.println(list);
        Collections.sort(list, (front, back) -> front.compareTo(back));
        System.out.println(list);
    }
}