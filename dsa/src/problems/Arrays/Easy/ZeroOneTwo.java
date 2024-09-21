package problems.Arrays.Easy;

import java.util.Arrays;
//color sorting -> Dutch Nation Flag Algorithm
public class ZeroOneTwo {

    static int[] sort1(int arr[]){

        for( int element:arr){
            if(element>2 || element <0){
                return new int[]{-1};
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    static void DNA(int arr[]){

        //Sorting array with in place i.e; without using another array
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        //using 3 pointers
        while(mid<=end) {

            switch (arr[mid]) {
                case 0:
                    swap(arr,mid,start);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,end);
                    end--;
                    break;

            }
        }
    }

    private static void swap(int[] array,int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,2,0,3};
        System.out.println(Arrays.toString(ZeroOneTwo.sort1(arr)));
    }
}
