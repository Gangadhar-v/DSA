package problems.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){



        for(int i = 0;i<arr.length;i++){

            int smallestIndex = i;
            int index = i+1;
            while(index<arr.length){

                if(arr[index]<arr[smallestIndex]){
                     smallestIndex = index;
                }
                index++;
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }

        return arr;
    }

    public static void main(String args[]){

        int[] arr = {7,8,3,1,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
