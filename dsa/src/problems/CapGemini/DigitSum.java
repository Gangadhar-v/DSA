package problems.CapGemini;

/*PROBLEMS STATEMENT
input -> 38
3+8 = 11
1+1 = 2
output = 2
 */
public class DigitSum {

    public static int digitSum(int num){

        if(num == 0){
            return 0;
        }

        return (num%9==0)?9:num%9;
    }
    public static void main(String args[]){
        System.out.println(digitSum(38));
    }
}
