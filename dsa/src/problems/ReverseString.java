package problems;


public class ReverseString {


    public static void main(String[] args){
        String reverseString = reverseString("v rahdagnag");
        System.out.println(reverseString);
    }
    static String reverseString(String name){
        String reveredString = "";
        for( int i = name.length() -1; i >=0 ; i--){
            reveredString += name.charAt(i);
        }

        return reveredString;
    }

}
