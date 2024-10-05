package problems.Leetcode;


import java.util.*;
import java.util.PriorityQueue;

/*
ProblemStatement
input -> "babad"
output -> "bad"
Explanation : "aba" is also valid

 */
public class LongestPalindromicSubString {

    public static String longestPalindrome(String s){


        ArrayList<String> subStrings = new ArrayList<>();
        //return all the substring
        for(int i = 0;i<s.length()-1;i++){
            for(int k = i+1;k<s.length();k++){
       StringBuilder subString = new StringBuilder();
                for(int j = i;j<=k;j++){
                   subString.append((s.charAt(j)));
                }
                if(isPalindrome(subString.toString())){
                    subStrings.add(subString.toString());
                }
            }
        }



        PriorityQueue<Map.Entry<String,Integer>> maxHeap = new PriorityQueue<>(
                (entry1,entry2)->Integer.compare(entry2.getValue(),entry1.getValue())
        );

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String a:subStrings){
            hashMap.put(a,getLength(a));
        }

        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            maxHeap.add(entry);
        }

       return maxHeap.poll().getKey();
    }


    //create function to check is palindrome
    public static boolean isPalindrome(String s){

        StringBuilder reversed = new StringBuilder();

        for(int i = s.length()-1;i>=0;i--){
            reversed.append(s.charAt(i));
        }

        return s.equals(reversed.toString());
    }

    public  static Integer getLength(String s){
        return s.length();
    }
    public static void main(String args[]){
        System.out.println(longestPalindrome("babad"));
    }
}
