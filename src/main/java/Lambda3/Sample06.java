package Lambda3;

import java.util.function.Supplier;

public class Sample06 {
    public static void main(String[] args){

        MessageCenter mc = new MessageCenter("Hello~Lambda!");
        System.out.println("toString : " + mc.toString());
        System.out.println("toString2 : " + mc.toString2());

        //1번 방식
        MessageCenter main = getMsg(()->mc);        /*supplier는 매개변수가 필요 없다.
                                                        내가 헷갈리는 부분은 getMsg에는 매개변수가 있는데
                                                        여기서는 매개변수가 없는 것이 의아했다.
                                                        매개변수가 필요없는 것이 키 포인트....
                                                        객체를 반환 했구나....!
                                                    */
        System.out.println("main의 결과값 : " + main); //이렇게 출력하면 main.toString 한 것과 동일

        //2번 방식
        Supplier<MessageCenter> param = () -> mc;
        MessageCenter main2 = getMsg(param);
        System.out.println("main2 : " + main2); //이렇게 출력하면 main2.toString 한 것과 동일

        //1번 방식과 2번 방식은 완전히 동일하다.
    }

    public static MessageCenter getMsg(Supplier<MessageCenter> mc){
        return mc.get();    //supplier의 메소드
    }

}

//======================================class 생성======================================
class MessageCenter{    //제네릭 타입에 들어갈 class 생성

    private final String msg;   /*강의에서 final을 사용한 이유는 Lombok 기능 중 final이 붙은 상수에 대해 생성자를 만들어주는
                                    @RequiredArgsConstructor를 사용하기 위함. 나는 Lombok 사용 중이 아니기에 생성자를 직접 만듦.
                                */

    public MessageCenter(String msg) {  //매개변수를 가지는 생성자 생성
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MessageCenter{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String toString2() {  //위의 toString과는 다르게 적용시키기
        return msg;
    }

}
//======================================class 생성======================================
