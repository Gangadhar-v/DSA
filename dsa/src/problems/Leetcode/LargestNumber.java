package problems.Leetcode;


import java.util.Arrays;

/*
PROBLEM STATEMENT
Given a list of non-negative integers nums,
arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 */
public class LargestNumber {

    public static String largestNumber(int[] array){

        String[] strNums = new String[array.length];

        for(int i = 0;i<array.length;i++){
            strNums[i] = String.valueOf(array[i]);
        }

        Arrays.sort(strNums,(a,b)->(b+a).compareTo(a+b));
//string are compared based on the ASCII value of the string, greater value will be sorted to first
//        'a' (ASCII 97) is smaller than 'b' (ASCII 98).
//        '1' (ASCII 49) is smaller than '9' (ASCII 57).
        StringBuilder result = new StringBuilder();

        for(String s:strNums){
            result.append(s);
        }

        return result.toString();
    }

    public static void main (String args[]){

        int[] nums = {1,2,2,1,0,9};
        System.out.println(largestNumber(nums));
        StringBuilder s = new StringBuilder();


    }
}
