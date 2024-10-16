package problems.Strings;

/*
PROBLEM STATEMENT
Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""

 */
public class GcdOfStrings {

    public static String gcdOfStrings(String str1, String str2) {

        int size1 = str1.length();
        int size2 = str2.length();

        int i = 0;
        boolean isgcd = true;
        for (int index = size2; index < size1; index = index + size2) {


            if (str1.substring(i, index) != str2) {
                isgcd = false;

            }
            i += size2;

        }

        if (isgcd) {
            return str2;
        } else {
            return " ASDFADF";
        }
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
    }
}
