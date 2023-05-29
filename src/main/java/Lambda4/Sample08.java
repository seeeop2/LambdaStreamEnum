package Lambda4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample08 {
    public static void  main(String[] args){
        List<Employee> emp = Arrays.asList(
            new Employee(1,"학건",2400),
            new Employee(2,"인호",2700),
            new Employee(3,"상도",3000),
            new Employee(4,"빵형",3200)
        );

        Consumer<Employee> consumer = x -> {
            x.setSalary(x.getSalary()*2);   //반환형이 없는 void이기 때문에, return 필요 없다.
        };
        System.out.println("== 연봉 2배 인상 ==");
        doubleSalary(emp,consumer.andThen(x-> System.out.println(x)));  /*andThen은 추상메소드가 아니다.
                                                                            즉, Consumer은 메소드가 두 개 이지만,
                                                                            1개의 추상메소드 + 1개의 일반 메소드로 구성
                                                                        */
//        doubleSalary(emp,consumer.andThen(System.out::println));
        /*메소드 참조란 개념이다. 람다식 때 매개변수와 사용될 부분이 명확할 때, 이처럼 생략해서 사용 가능 */

    }
    private static void doubleSalary(List<Employee> emp, Consumer<Employee> f){
        for(Employee e : emp){
            f.accept(e);
        }
    }
}


class Employee{
    private int no;
    private String name;
    private double salary;

    public Employee(int no, String name, double salary) {
        this.no = no;
        this.name = name;
        this.salary = salary;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
