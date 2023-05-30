package enum2;

public class Sample03 {
    public static void main(String[] args) {
        FLOWER flower = FLOWER.ROSE;
        System.out.println(flower.getName());   //rose

    }
}


enum FLOWER{
    SUNFLOWER("sunflower"),ROSE("rose");
    //하나하나 각자가 하나의 클래스다. 그래서 new키워드를 이용해서 생성한다고 생각.

    private final String name;  //Enum 사용하기 위해 필요

    FLOWER(String flowerName) { //Enum 사용하기 위해 필요. 위에 주석 참고
        this.name = flowerName;
    }

    public String getName() {   //괄호 안에 있는 value 값을 가져오기 위해 Getter 필요
        return name;
    }
}
