package Lambda2;

public class Sample03 {

    public static void main(String[] args){

        Runnable r = () -> System.out.println("익명 내부 클래스 실행");  //Java에서 기본 제공하는 인터페이스

        r.run();
        r.run();
        /*
        결과 :
        익명 내부 클래스 실행
        익명 내부 클래스 실행
        */
    }
}