package Lambda7;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample14 {
    public static void main(String[] args){
        //Function은 매개변수와 반환자료형을 각각 정의
        Function<String,String> sourceFile = p -> p +".java";

        //UnaryOperator는 매개변수와 반환자료형을 하나로 정의
        UnaryOperator<String> classFile = (String s) -> s + ".class";
                                            //ㄴ괄호 생략 가능. 생략시 'String'도 생략하기

        System.out.println(sourceFile.apply("Sample14_1"));
        System.out.println(classFile.apply("Sample14_2"));


        //출력받은 값을 추가 없이 사용하겠다면? identity 사용
        Function<String,String> a = Function.identity();
        UnaryOperator<String>   b = UnaryOperator.identity();

        System.out.println(a.apply("Python"));
        System.out.println(b.apply("Python"));

    }
}
