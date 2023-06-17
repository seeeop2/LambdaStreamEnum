package Lambda6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample13 {
    public static void main(String[] args){
        //로또 당첨번호 : 5, 12, 25, 26, 38, 45
        List<Integer> luckNo = Arrays.asList(5,12,25,26,38,45);
        List<Integer> myNo = Arrays.asList(6,13,26,27,39,45);

        Predicate<List<Integer>> isLucky = Predicate.isEqual(luckNo);

        if(isLucky.test(myNo)){
            System.out.println("로또 1등 당첨!");
        } else{
            System.out.println("로또 1등 미당첨...");
        }


    }
}
