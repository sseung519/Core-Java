import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {
        //날짜를 가져오는 다양한 방법
        //1)
        Date now = new Date();
        System.out.println(now); //now.toString();

        //2)
        Calendar cal = Calendar.getInstance();
        System.out.printf("오늘은 %d년 %d월 %d일입니다.%n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH));

        //3)
        Calendar cal2 = new GregorianCalendar(2024,11,25);
        System.out.printf("금년은 %d년%n", cal2.get(Calendar.YEAR));

        //4)
        DateFormat df = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, Locale.KOREA
        );
        System.out.println(df.format(new Date()));

        //5)
        String pattern = "오늘은 yyyy년 MM월 dd일 입니다.";
        DateFormat df2 = new SimpleDateFormat(pattern);

        //6)
        String pattern2 = String.format("오늘은 %1tY년 %1$tm월 %1$td일입니다", new Date());
        System.out.println(pattern2);
    }
}