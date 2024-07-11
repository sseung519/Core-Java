public class Employee {
    String sabun;
    double salary;
    public Employee(){
        //this()는 자신의 다른 생서자를 호출하는 코드로 반드시 생성자의 *첫 줄 에서만 사용 가능.
        //System.out.println(); <- 이렇게 this 위에 다른게 있을 경우 불가능
        this("임시사번", 10_000_000);
    }
    public Employee(String sabun) {
        this.sabun = sabun;
        ;
    }
    public Employee( double salary){
            this.salary = salary;
        }
    public Employee(String sabun, double salary){
            this.sabun = sabun;
            this.salary = salary;
        }
    }

