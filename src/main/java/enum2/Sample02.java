package enum2;

public class Sample02 {
    public static void main(String[] args){
        System.out.printf("허수아비가 %s의 %s 티를 입고 있습니다.", Size2.LARGE,Color2.RED);
        //허수아비가 LARGE의 RED 티를 입고 있습니다. <-toString 오버라이드 전
        //허수아비가 큰 사이즈의 빨간색 티를 입고 있습니다. <-toString 오버라이드 후

    }
}

enum Color2{
    RED{
        @Override
        public String toString() {
            return "빨간색";
        }
    },
    BLUE{
        @Override
        public String toString() {
            return "파란색";
        }
    },
    ORANGE{
        @Override
        public String toString() {
            return "귤색";
        }
    };
}

enum Size2{
    SMALL{
        @Override
        public String toString() {
            return "작은 사이즈";
        }
    },
    MEDIUM{
        @Override
        public String toString() {
            return "중간 사이즈";
        }
    },
    LARGE{
        @Override
        public String toString() {
            return "큰 사이즈";
        }
    };
}