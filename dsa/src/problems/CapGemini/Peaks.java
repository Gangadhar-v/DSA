package problems.CapGemini;

import java.util.ArrayList;

/*
PROBLEM STATEMENT
Detecting Peaks in an Array
Problem: Given an array of integers, find all the elements that are "peaks" (elements that are greater than both their previous and next values).
Example: For the array [1, 3, 2, 4, 1], the peaks are 3 and 4.


 */
public class Peaks {

    public static void main(String[] args) {
        int[] arr3 = {1,3,2,4,1};
        peaks(arr3);
    }
    public static void peaks(int[] arr){

        int previous = 0;
        int current = 1;
        int next = 2;
        ArrayList<Integer> result = new ArrayList<>();

        while(next<arr.length){
            if(arr[current]>arr[previous] && arr[current]>arr[next]){
                result.add(arr[current]);
            }
            previous++;
            current++;
            next++;
        }

        System.out.println(result);
    }
}
