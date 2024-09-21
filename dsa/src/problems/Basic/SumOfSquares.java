package problems.Basic;


import java.util.HashSet;
import java.util.Set;

/*
if the sum of square of their digits = 1 then it is happy number
 */
public class SumOfSquares {

    public static boolean favNumber(int number){

        /*
        set keeps track of all numbers we have seen so far.
         If we encounter the same number again,
         it means we are in a cycle, and the number is not a happy number.
         */
        Set<Integer> seen = new HashSet<>();
        while(number!=1 && !seen.contains(number)){
            int sum = sumSqrOfDigits(number);
            seen.add(number);
            number = sum;

        }

        return number==1;
    }



    //function to make sum of square of their digits

    public static int sumSqrOfDigits(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }

    public static void main(String args[]){

        System.out.println(favNumber(19));

    }
}
