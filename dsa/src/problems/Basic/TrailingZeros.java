package problems.Basic;

public class TrailingZeros {

    public static int factorial(int i){
        if(i==0) return 1;
        if(i==1) return 1;
        else {
            return i*factorial(i-1);
        }
    }

    public static int trailingZero(int i){
        int count = 0;
        int result = factorial(i);
       while(result!=0){
           int digit = result%10;
           if(digit == 0) count++;
           result=result/10;
       }
       return count;
    }

    /* More efficient way */

/*
Divide the number by the Multiples of 5
count = quotient
termination condition = quotient>=1
 */


    public static int trailingZeros2(int number){
        int count = 0;
        for(int i = 5;number/i>=1;i=i*5){
            count =count+number/i;
        }

        return count;
    }
    public static void main(String args[]){
        System.out.println(trailingZeros2(100));

    }
}
