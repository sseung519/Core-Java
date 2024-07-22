public class Output {
    void output(Student std){
        System.out.println("학번\t국어\t수학\t총점\t평균\t평점");
        System.out.println("---------------------------------------");
        std.print();
//        System.out.printf("%-10s%5d%5d%5d%5d%7.1f%3c",std.hakbun,std.kor,std.eng,std.math,std.tot,std.avg, std.grade);
    };
}
