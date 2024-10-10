package problems.Strings;

import java.util.List;

/*
PROBLEM STATEMENT
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseString {


    public static String reverseString(String s){

        String[] a = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String i:a){
            String word = reverseWord(i);
            result.append(word).append(" ");
        }

return result.toString().trim();
    }

    public static String reverseWord(String word){


        StringBuilder r = new StringBuilder();

        for(int i = word.length()-1;i>=0;i--){
            r.append(word.charAt(i));
        }

        return r.toString();
    }
    public static void main(String args[]){

        String name = "Let's take LeetCode contest";
        System.out.println(reverseString(name));

    }
}
