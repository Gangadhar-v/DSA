package problems.Basic;
/*
Key Insight for Factorials
When calculating
𝑛
!
n!, there are usually more factors of 2 than 5, so the number of trailing zeros is determined by the number of times 5 is a factor in the sequence of numbers from 1 to
𝑛
n.

Steps to Calculate Trailing Zeros
Count how many times 5 appears as a factor in the numbers from 1 to
𝑛
n.
Additionally, consider multiples of higher powers of 5 (like
25
,
125
,
625
,
…
25,125,625,…) because they contribute additional factors of 5.
 */
public class TrailingZeros {



    public static int trailingZeros(int num){

        int count = 0;
        for(int i = 5;i<=num;i=i*5){

            for(int j = 1;j<=num;j++){

                if(j%i == 0){
                    count++;
                }
            }
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
        System.out.println(trailingZeros(100));

    }
}
