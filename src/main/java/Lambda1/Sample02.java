package Lambda1;

public class Sample02 {

    public static void main(String[] args){

    Sample02Function f2 = (a) -> a; // (a)는 (String a)라고 보면 된다.
    Sample02Function f2_ = a -> a;  // 매개변수가 하나일 경우, 괄호 생략 가능

    System.out.println(f2.test("샘플02 테스트 출력 1"));
    System.out.println(f2_.test("샘플02 테스트 출력 2"));


    Sample02Function f3 = (a) -> {  //한 줄이 아니라 여러 줄일 경우, 중괄호 사용
        return a;                   //만약 중괄호 사용 시(=여러 줄 작성 시), 반환값은 return을 꼭 표시
    };

    System.out.println(f3.test("샘플02 테스트 출력 3"));

    }
}

@FunctionalInterface
interface Sample02Function{
    public String test(String a);   /*Sample01Function이랑 차이점 2가지
                                        1.반환타입
                                        2.매개변수
                                    */
}
