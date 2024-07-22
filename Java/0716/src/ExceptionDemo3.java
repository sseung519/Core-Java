public class ExceptionDemo3 {
    public static void main(String[] args)  {
        Student sseung = new Student();
//        try {
//            sseung.setKor(120);
//            System.out.println(sseung);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        sseung.setKor(100);
        try {
            sseung.setHistory(120);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sseung); //sseung.toString()
    }
}
class HistoryException extends Exception { // checked Exception
    public HistoryException(String msg) {
        super(msg);
    }
}

class KoreanException extends RuntimeException { // Unchecked Exception
    public KoreanException(String msg) {//생성자
        super(msg);
    }
}

class Student {
    private int kor;
    private int history;
    public void setHistory(int history) throws Exception {
        if (history >= 0 && history <= 100) {
            this.history = history;
        } else throw new HistoryException("역사 점수는 0부터 100까지의 범위만 인정합니다.");

    }
    public void setKor(int kor) throws KoreanException {
        if (kor >= 0 && kor <= 100) {
            this.kor = kor;
        } else throw new KoreanException("국어 점수는 0부터 100까지의 범위만 인정합니다.");
    }

    @Override
    public String toString() {
        return "kor = " + this.kor + ", history = " + this.history;
    }
}
