package problems.GeeksForGeeks.Arrays.SlidingWindow;


/*
PROBLEM STATEMENT
Problem: Given an array of positive integers and a positive integer S, find the length of the smallest contiguous subarray whose sum is greater than or equal to S.
Example:
Input: arr = [2, 1, 5, 2, 3, 2], S = 7
Output: 2
Explanation: The smallest subarray with a sum greater than or equal to 7 is [5, 2].

*/
public class SmallestSubArray {

    public static int smallestSubArrayLength(int[] arr, int sum){

        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int windowSum = 0;

        //first find the sum

        for(int end = 0;end<arr.length;end++){

            windowSum += arr[end];

                while(windowSum >= sum){
                    minLength = Integer.min(minLength, end-start+1);
                    windowSum -= arr[start];
                    start++;
                }
            }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
        
    public static void main(String args[]){

        int[] arr = {2, 1, 5, 2, 3, 2};
        System.out.println(smallestSubArrayLength(arr,7));
    }
}
