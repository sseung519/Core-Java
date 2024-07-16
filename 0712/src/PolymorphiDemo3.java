public class PolymorphiDemo3 {
    public static void main(String[] args) {
//        Dog[] array = new Dog[3];
//        array[0] = new Cat();

        Mammal[] array = new Mammal[4]; //포유류가 부모class라서 자식class 다 가능
         array[0]= new Dog();
         array[1]= new Cat();
         array[2]= new American();
         array[3]= new Korean();

         for (Mammal m : array) {
             System.out.println(m);
         }
    }
}

