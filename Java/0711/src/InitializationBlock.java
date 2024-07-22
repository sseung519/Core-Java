public class InitializationBlock {
    private double weight; // member variable
    private char grade;
    {
        this.weight = 100;
        this.grade = 'F';
        System.out.println("나는 초기화 블록");
    }
    public InitializationBlock() { //default constructor's overriing
        this.weight = 68.5;
        this.grade = 'A';

    }

    public static void main(String[] args) {
        InitializationBlock sseung = new InitializationBlock();
        System.out.println(sseung.weight + "kg");
        System.out.println(sseung.grade);
    }
}
