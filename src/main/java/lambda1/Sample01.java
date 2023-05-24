package lambda1;

public class Sample01 {

    public static void main(String[] args){

        Sample01Function f = () -> System.out.println("샘플01 테스트 출력");   //람다식
        f.test();

        Sample01Function f2 = new Sample01Function() {      //내가 원래 사용하던 방식
            @Override                                       //인터페이스 만들고, 메소드를 오버라이드
            public void test() {                            //람다식은 1줄, 오버라이드는 6줄
                System.out.println("샘플01 테스트 출력");       //훨씬 간단해서 사용하기 좋다.
            }                                               //오버라이드 방식은 @FunctionalInterface 사용 안해도 된다.
        };
        f2.test();

    }
}

@FunctionalInterface    /*단 한 개의 추상 메서드를 갖고 있는 인터페이스. 만약 메소드가 2개 이상이면, 에러...
                            람다식으로 사용하고자 할 경우, 꼭 이 방식을 사용*/
interface Sample01Function{
    public void test(); /*public abstract void test() 이렇게 abstract를 적어 추상화라고 알릴 수 있으나,
                            인터페이스는 원래 추상화이기 때문에 굳이 적지 않아도 된다.*/
}
