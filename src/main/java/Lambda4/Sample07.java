package Lambda4;

import java.util.function.Consumer;

public class Sample07 {
    public static void  main(String[] args){
        Consumer<String> c = x ->{
            System.out.printf("%s는 1개의 매개변수는 있지만, 반환할 자료형은 없습니다.\n",x.toUpperCase());
            System.out.println("안녕하신가"+x);
        };

        c.accept("Consumer");   //CONSUMER는 1개의 매개변수는 있지만, 반환할 자료형은 없습니다.
                                    /*내가 약간 헷갈리는 부분
                                        위에서 선언한다고 바로 실행되는 것은 아니다.
                                        accept 메소드를 이용해야 그때 선언된 내용이 출력
                                    */
    }
}
