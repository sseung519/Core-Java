public class Calc {
    void calc(Student std){
        int tot = std.getKor() + std.getEng() + std.getMath();
        std.setTot(tot);
        double avg = tot/ 3.0;
        std.setAvg(avg);
        char grade = avg>= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F';
        std.setGrade(grade);
    };
}
