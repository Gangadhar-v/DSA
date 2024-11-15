package problems.CapGemini;

import java.util.ArrayList;

/*
PROBLEM STATEMENT
Finding Local Minima in an Array
Problem: Find all "local minima" in an array of integers (elements that are smaller than both their previous and next elements).

Example: In [3, 1, 3, 2, 4], the local minima are 1 and 2.
Approach: Iterate through the array and compare each element with its previous and next values.


 */
public class LocalMinima {

    public static void main(String args[]){
        int[] arr2 = {3,1,3,2,4};
        local_minima(arr2);
    }
    public static void local_minima(int[] arr){

        int start = 0;
        int end = 2;
        int current = 1;
        ArrayList<Integer> result = new ArrayList<>();

        while(end<arr.length){

            if(arr[current]<arr[start] && arr[current]<arr[end]){
                result.add(arr[current]);
            }
            end ++;
            start++;
            current++;

        }
        System.out.println(result);
    }
}
