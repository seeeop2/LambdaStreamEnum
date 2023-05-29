package Lambda4;

import java.util.Arrays;
import java.util.List;

public class Sample09 { //Sample08이랑 결과는 동일, 조금 더 간결해지는 forEach 사용법
    public static void  main(String[] args){
        List<Employee> emp = Arrays.asList(
            new Employee(1,"학건",2400),
            new Employee(2,"인호",2700),
            new Employee(3,"상도",3000),
            new Employee(4,"빵형",3200)
        );

        System.out.println("== 연봉 2배 인상 ==");

        emp.forEach(x -> {
            x.setSalary(x.getSalary()*2);
            System.out.println(x);
        });
    }
}