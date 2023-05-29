package Lambda3;

import java.util.function.Supplier;

public class Sample05 {
    public static void main(String[] args){
        Runnable r = () -> System.out.println("Runnabled은 매개변수도 없으며 반환 자료형도 없습니다.");
        r.run();        //Runnable 복습

        Supplier<String> s = () -> {    //위에 한 줄로 작성해봤으니, 중괄호 사용해보기
            return "Supplier는 매개변수는 없지만 반환 자료형은 있습니다.";
        };
        System.out.println(s.get());

    }
}
