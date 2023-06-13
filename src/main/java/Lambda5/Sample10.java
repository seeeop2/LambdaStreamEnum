package Lambda5;

import java.util.function.Function;

public class Sample10 {
    public static void main(String[] args){
        Function<Integer, String> f = i ->{ //매개변수 1개 일 경우, 괄호 생략 가능. 원래 (Integer i)를 적으면 된다.
            String str = null;
            if(i == 1){     //반환하는 switch case문은 jdk14부터 사용 가능. 그래서 나는 if문 사용.
                str = "one";
            } else if(i == 2){
                str = "two";
            } else if(i == 3){
                str = "three";
            } else if(i == 4){
                str ="four";
            } else if(i == 5){
                str = "five";
            } else{
                str = "Unexpected Value : " + i;
            }

            return str;
        };

        System.out.println(f.apply(3)); //three
    }
}
