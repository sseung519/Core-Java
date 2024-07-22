public class InterfaceDemo2 {
    public static void main(String[] args) {
        Product pencil = new Product("모나미 연필");
//        Product ballpen = pencil; //주소 복사
//        System.out.println(ballpen.name);
        Product ballpen = pencil.copy();
    }
}

class Product extends Object implements Cloneable{ //flag interface
    String name;
    public Product(String name) {
        this.name = name;
    }
    public Product copy(){
        Product target = null;
        try {
            Object obj = this.clone();
            if(obj instanceof Product){
                target = (Product) obj;
                System.out.println("형변환 됨");
            } else {
                System.out.println("형변환 안됨.");
            }
        } catch(CloneNotSupportedException e) {
            System.out.println("복제 안됨.");
        }
        return target;
    }
}
