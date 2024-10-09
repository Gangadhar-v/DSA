package problems.PrimeCoding;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfSum {

    public static int differenceOfSum(int m, int n){

        int sum = 0;
        int start = 1;

        for(int i = 0;i<=n;i+=m){
            sum+=i;
        }



        return sum;
    }

    public static void main(String args[]){
        System.out.println(differenceOfSum(6,30));
    }
}
