package Lambda5;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Function;

public class Sample11 {
    public static void main(String[] args){
        Function<Integer,String> f = i ->{
            String returnStr = "";

            for(AlphaNum a : AlphaNum.values()){
                if(i == a.getNum()){
                    returnStr = a.toString();
                    break;  //찾았으면 더 이상 비교해볼 필요가 없으니 break를 사용해서 for문 빠져 나온다. 의미없는 반복문 차단
                }
            }
            return returnStr;
        };

        System.out.println(f.apply(2));
    }
}

@Getter             //lombok 사용
@AllArgsConstructor
enum AlphaNum{
    one(1), two(2), three(3), four(4), five(5); //변수명은 숫자가 올 수 없기에 one,two,three... 작성
    private final int num;

/*
lombok을 사용하지 않았다면, 아래의 코드를 작성.
    public int getNum() {
        return num;
    }

    AlphaNum(int num) {
        this.num = num;
    }
*/
}
