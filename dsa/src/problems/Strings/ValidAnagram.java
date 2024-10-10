package problems.Strings;

import java.util.Arrays;

/*
PROBLEM STATEMENT
Input: "anagram", "nagaram"
Output: true
 */
public class ValidAnagram {

    public static boolean isAnagram(String str1,String str2){

        int[] array1 = new int[26];
        int[] array2 = new int[26];

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0;i<str1.length();i++){

            array1[ str1.charAt(i)-'a']++;
            array2[str2.charAt(i)-'a']++;
        }

        return Arrays.equals(array1,array2);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("malayam","mmaaaly"));
    }
}
