package enum3;

public class Sample04 {
    public static void main(String[] args){
        System.out.println(BIRD.SPARROW.getName());

        BIRD2 bird2 = new BIRD2("앵무새",27);  //Enum 사용 안 할 경우
        System.out.println(bird2.getName());

        System.out.println(BIRD3.SPARROW.getName());    //class를 Enum처럼 사용하게 만들기
        System.out.println(BIRD3.PARROT.getName());     //class를 Enum처럼 사용하게 만들기

    }
}

enum BIRD{
    SPARROW("참새",33),PARROT("앵무새",27);

    private final String name;
    private final int count;

    BIRD(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}

//==========================================만약 Enum 말고 class로 만들었을 경우==========================================
class BIRD2{
    private String name;
    private int count;

    public BIRD2(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
//========================================여기까지 만약 Enum 말고 class로 만들었을 경우========================================

//========================================Class를 Enum처럼 사용하게 만들기========================================
class BIRD3{
    static class SPARROW{
        private static String name = "참새";
        private static int count = 33;

/*
        public SPARROW(String name, int count) {
            this.name = name;
            this.count = count;
        }
        static으로 사용할 경우 생성자가 필요 없다.
*/

        public static String getName() {
            return name;
        }

        public static int getCount() {
            return count;
        }
    }

    static class PARROT{
        private static String name = "앵무새";
        private static int count = 27;


        public static String getName() {
            return name;
        }

        public static int getCount() {
            return count;
        }
    }
}
//========================================여기까지 Class를 Enum처럼 사용하게 만들기========================================
