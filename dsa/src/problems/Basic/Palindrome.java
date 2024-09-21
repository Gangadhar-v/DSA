package problems.Basic;

/*
input ->909
output ->true
 */
public class Palindrome {

    public static int palindrome(int number){
        int reversedNumber = 0;
        while(number!=0){
            int digit = number%10;
            reversedNumber = reversedNumber*10 + digit;
            number = number/10;
        }

        return reversedNumber;

    }
    public static void main(String args[]){
        System.out.println(palindrome(909));
    }
}
