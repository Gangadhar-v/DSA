package problems.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){


        for(int i=0;i<arr.length;i++){

            int startIndex = 0;
            int endIndex = 1;

            while(endIndex<arr.length){

                if(arr[startIndex]>arr[endIndex]){
                    swap(startIndex,endIndex,arr);
                }
                startIndex++;
                endIndex++;
            }
        }
        return arr;
    }

    public static void swap(int index1,int index2,int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String str[]){
        int[] arr = {7,8,3,1,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
