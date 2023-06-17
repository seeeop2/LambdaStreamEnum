package Lambda6;

import java.util.Scanner;
import java.util.function.Predicate;

public class Sample12 {     //홀수-짝수 알아내는 예제
    public static void main(String[] args){

        Predicate<Integer> isOdd = (s) -> (s % 2) == 1;
        Predicate<Integer> isEven = Predicate.not(isOdd);   //jdk 11부터 사용가능
                                                            //Predicate.negate() 메소드도 위와 동일하게 작동

        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수를 입력하세요 : ");
//        scanner.hasNextInt();   //정수 입력 시 true를 반환하고 그렇지 않은 경우 false를 반환합니다.
                                    //굳이 여기 적을 필요가 있었을까 의문.
        int num = scanner.nextInt();

        if(isOdd.test(num)){
            System.out.println("홀수를 입력하셨습니다.");
        } else if(isEven.test(num)){
            System.out.println("짝수를 입력하셨습니다.");
        }


    }
}
