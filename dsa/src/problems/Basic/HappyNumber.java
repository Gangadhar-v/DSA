package problems.Basic;


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    //the loop with run infinite for non-happy number;
    //therefore add terminate condition for non-happy number i.e; if sum == number
    public static boolean  isHappyNumber(int n) {

    /*
    set keeps track of all numbers we have seen so far.
     If we encounter the same number again, it means we are in a cycle,
      and the number is not a happy number.
     */
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)) {
             int result =digitSqrSum(n);
             seen.add(n);
             n = result;
        }
        return n==1;
    }

        public static int digitSqrSum(int number){
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                sum += digit*digit;
                number = number / 10;
            }

            return sum;
        }


    public static void main(String[] args) {


        System.out.println(isHappyNumber(2));
        System.out.println(isHappyNumber(19));

    }
}
