public class Output {
    private Student[] array;

    public Output(Student[] array) {
        this.array = array;
    }
    void output() {
        for(Student std : this.array) {
            System.out.printf("%-5s\t%7s\t%5d\t%5d\t%5d\t%5d\t%5d\t%8.1f\t%5c%n",
                    std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMat(),std.getEdp(),
                    std.getTot(),std.getAvg(),std.getGrade());
        }
    }
}
