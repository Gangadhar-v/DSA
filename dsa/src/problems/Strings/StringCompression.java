package problems.Strings;
/*
PROBLEM STATEMENT
Input: "aabcccccaaa"
Output: "a2b1c5a3"
 */
public class StringCompression {

    public static String stringCompression(String str){

        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        int charCount = 1;
        for(int i = 1;i<str.length();i++){

            if(currentChar == str.charAt(i)){
                charCount++;
            }else{
                result.append(currentChar).append(charCount);
                currentChar = str.charAt(i);
                charCount = 1;

            }
        }
        result.append(currentChar).append(charCount);

        return result.toString();
    }
    public static void main(String args[]){
        System.out.println(stringCompression("aabcccccaaa"));
    }
}
