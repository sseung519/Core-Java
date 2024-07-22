public class EnumDemo {
    public static void main(String[] args) {
//        Season season = new Season(); //자바에서 Enum 타입은 static이기 때문에 new로 생성하지 않고 사용
        Season season = Season.fall;
//        System.out.println(season);
//        System.out.println(season.ordinal());
        System.out.println(season.getValue());
    }
}
