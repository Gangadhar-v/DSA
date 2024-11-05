package problems.GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* PROBLEM STATEMENT
Find the Longest Consecutive Sequence
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example:
Input: [100, 4, 200, 1, 3, 2]
Output: 4 (the sequence: [1, 2, 3, 4])

 */
public class LongConsecutiveSequence {

    public static int approach1(int[] arr) {


       List<List<Integer>> sequences = new ArrayList<>();
       List<Integer> currentSequence = new ArrayList<>();



        Arrays.sort(arr);
        currentSequence.add(arr[0]);
        for(int i = 1;i<arr.length;i++){

            if(arr[i] - arr[i-1] == 1){
                currentSequence.add(arr[i]);
            }else{
                sequences.add(currentSequence);
                currentSequence = new ArrayList<>();
                currentSequence.add(arr[i]);
            }
        }

        sequences.add(currentSequence);


        int maxSize = Integer.MIN_VALUE;
        for(List<Integer> currentSeq:sequences){

            int size = currentSeq.size();
            maxSize = Integer.max(size,maxSize);
        }




return maxSize;

    }
    //OPTIMIZED ONE
    public static int approach2(int[] arr){

        Arrays.sort(arr);
        int first = 0;
        int maxCount = Integer.MIN_VALUE;
        int count = 1;
        for(int i = 1;i<arr.length;i++){

            if(arr[i]-arr[first] == 1){
                count++;
            }else{
                maxCount = Integer.max(maxCount,count);
                count = 1;

            }
            first = i;
        }
        return maxCount;
    }

    public static void main(String agrs[]){

        int[] arr= { 100,4,200,1,3,2};
        System.out.println(approach2(arr));
    }
}
