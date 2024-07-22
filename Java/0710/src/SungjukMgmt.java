public class SungjukMgmt {
    public static void main(String[] args) {
        Student sseung = new Student();
//        CallbyRefDemo1 a = new CallbyRefDemo1();

        new Input().input(sseung);
        new Calc().calc(sseung);
        new Output().output(sseung);
    }
}
