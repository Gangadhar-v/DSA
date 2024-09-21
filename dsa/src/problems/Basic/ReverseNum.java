package problems.Basic;

/*
input -> 12345
output ->54321
 */
public class ReverseNum {

    public static int reverseNum(int number){

        int originalNum = number;
        StringBuilder reversed = new StringBuilder();
        while(originalNum != 0){

            int digit  = originalNum%10;
            reversed.append(digit);
            originalNum= originalNum/10;  //remove last digit

        }

        return Integer.parseInt(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(12345));
    }
}
