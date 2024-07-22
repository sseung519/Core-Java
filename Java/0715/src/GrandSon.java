public class GrandSon implements Son{
    public static void main(String[] args) {
        //GrandFather는 본인의 메소드만 접근 가능
        GrandFather gf = new GrandSon();
        gf.grandFather();
        //Father는 본인 메소드와 GrandFather 메소드 접근 가능
        Father father = new GrandSon();
        father.grandFather();
        //Mother는 본인 메소드만 접근 가능
        Mother mother = new GrandSon();
        mother.mother();
        //Son은 GrandFather, Father, Mother 그리고 본인 메소드 모두 접근 가능
        Son son = new GrandSon();
        son.son();
        Son[] array = new Son[3];
        System.out.println(Father.name + ", " + Mother.name);
    }

    @Override
    public void father(){
        System.out.println("Called by father()");
    };

    @Override
    public void grandFather(){
        System.out.println("Called by grandFather()");
    };

    @Override
    public void mother(){
        System.out.println("Called by Mother()");
    };

    @Override
    public void son(){
        System.out.println("Called by son()");
    };


}