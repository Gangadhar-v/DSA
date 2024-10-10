package problems.Strings;

/*
PROBLEM STATEMENT
Input: "A man, a plan, a canal: Panama"
Output: true
 */
public class PalindromeChecker {

    public static boolean palindromeChecker(String str){

        // regex for whitespace -> \\s
        //removing all non-alphanumeric characters(including whitespace)
      String newStr =  str.toLowerCase().replaceAll("[^a-z0-9]","");


        return isPalindrome(newStr);
    }

    public static boolean isPalindrome(String str){

        StringBuilder result = new StringBuilder();
        result.append(str);
        String reversed = result.reverse().toString();

        return str.equals(reversed);
    }

    public static void main(String args[]){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(palindromeChecker(str));
    }
}
