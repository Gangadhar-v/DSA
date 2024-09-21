package problems.Arrays.Easy;

import java.util.Arrays;


//when start is more than end,it means the array traverse is completed from both ends
public class ReverseArray {
    static int[] reverseArray(int[] array){

        int start = 0;
        int end = array.length - 1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
