public class EqualsDemo {
    public static void main(String[] args) {
        Point original = new Point(30, 100);
        Point target = new Point(30, 100);
        //Override하지 않은 오리지날 equals()는 객체의 주소 비교를 한다.
        //객체의 equals는 기본적으로 값을 비교하지 않는다.
        //String은 equals를 재정의 하기 떄문에 값을 비교함.
        System.out.println(original.equals(target));
    }
}
class Point extends Object {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(x, y) = (%d, %d)", this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        if(this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}
