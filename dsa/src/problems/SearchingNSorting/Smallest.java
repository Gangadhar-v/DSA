package problems.SearchingNSorting;

import java.util.Arrays;

/*
Given an unsorted array, the function should return the Mth smallest element of the array

 */
public class Smallest {

    public static int smallest(int[] array){

        int smallestElement = Integer.MAX_VALUE;
        for(int element :array){
            smallestElement = Math.min(smallestElement,element);
        }

        return smallestElement;
    }
    public static void main(String args[]){
        int[] array = {1,2,7,8,9,3,4,5,6,0};
        System.out.println(smallest(array));
        System.out.println(MthSmallestInteger(array,5));
    }

    public static int MthSmallestInteger(int[] array, int m){
        Arrays.sort(array);
        return array[m-1];
    }
}
