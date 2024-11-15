package problems.CapGemini;

import java.util.ArrayList;

/*PROBLEM STATEMENT
Longest Increasing Subsequence
Problem: Given an array of integers, find the length of the longest contiguous increasing subsequence.
Example: For [1, 3, 2, 3, 4, 5], the longest increasing subsequence is [2, 3, 4, 5], with a length of 4.

 */
public class LongestSequence {

    public static void main(String args[]){
        int[] arr = {1,3,2,3,4,5};
        longest(arr);
    }
    public static void longest(int[] arr){

        ArrayList<Integer> sub = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int currentIndex = 0;
        sub.add(arr[currentIndex]);
        for(int i = 1;i<arr.length;i++){

            if(arr[i] - arr[currentIndex] == 1){
                sub.add(arr[i]);
            }else{
                result.add(sub);
                sub.clear();
                sub.add(arr[i]);
            }
            currentIndex++;
        }

        result.add(sub);



        ArrayList<Integer> a = result.get(0);

        for(ArrayList<Integer> subArr:result){
            if(subArr.size()>a.size()){
                a = subArr;
            }
        }


        System.out.println(a);

    }
}
