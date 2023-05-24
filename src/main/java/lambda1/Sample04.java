package Lambda1;

import java.util.function.Function;

public class Sample04 {

    public static void main(String[] args){

    Sample04Function r = (int t) -> {
        String result = "";
        for(int i = 0 ; i < t ; i++){
            result += "만세\n";
        }
        return result;
    };

    System.out.println(r.apply(3));
    /*결과 : 만세
            만세
            만세
    */

//==============================위 코드를 함수형 인터페이스로 변경해보기==============================

    Function<Integer,String> r2 = (Integer t2) ->{
        String result2 = "";

        for(int j = 0 ; j < t2 ; j++ ){
            result2 += "만세~\n";
        }
        return result2;
    };

        System.out.println(r2.apply(3));
    /*결과 : 만세~
            만세~
            만세~
    */
//==============================여기 까지 위 코드를 함수형 인터페이스로 변경해보기==============================


    }
}

interface Sample04Function{     //원래 @FunctionalInterface 어노테이션을 위에 선언해주는데, 없어도 상관없다.
    public String apply(int t);
}
/*
위 interface 방식을 추천하지 않고 아래의 함수형 인터페이스 API를 추천하는 이유?
컴파일 과정을 거치면서 target 폴더에 인터페이스 class파일이 생긴다.
없어도 되는 파일을 만드는 것이니, 자바에서 이미 제공해주는 인터페이스 사용하는 것이 좋다.
*/


/*
- 함수형 인터페이스 API
1. Runnable
메소드 이름 : run()
매개 변수 : 없음
반환 자료형 : void

2. Supplier
메소드 이름 : get()
매개 변수 : 없음
반환 자료형 : T

3. Consumer
메소드 이름 : accept(T t)
매개 변수 : 1개
반환 자료형 : void

4. Function<T,R>
메소드 이름 : apply(T t)
매개 변수 : 1개
반환 자료형 : R

5. Predicate
메소드 이름 : test(T t)
매개 변수 : 1개
반환 자료형 : boolean

6. UnaryOperator
메소드 이름 : apply(T t)
매개 변수 : 1개
반환 자료형 : T

7. BiConsumer<T,U>
메소드 이름 : accept(T t, U u)
매개 변수 : 2개
반환 자료형 : void

8. BiFunction<T,U,R>
메소드 이름 : apply(T t, U u)
매개 변수 : 2개
반환 자료형 : R

9. BiPredicate<T,U>
메소드 이름 : test(T t, U u)
매개 변수 : 2개
반환 자료형 : boolean

10. BinaryOperator
메소드 이름 : apply(T t, U u)
매개 변수 : 2개
반환 자료형 : T

7~10은 3~6 매개변수 2배라고 생각
나머지는 동일

실무에서 람다식을 사용할 때 굳이 interface를 작성할 필요 없이 자바에서 제공해주는
인터페이스로 대부분 처리 가능할 것
*/