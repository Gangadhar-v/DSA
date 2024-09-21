package problems.SearchingNSorting;

import java.util.Arrays;

public class Shift0s {
    public static int[] shiftZeros(int [] array){

        int end = array.length-1;
        int index = 0;
        for(int i = 0;i<=end;i++){
            if(array[i] == 0){
                array[index++] = array[i];
            }
        }
        while(index<array.length){
            array[index++] = 1;
        }
        return array;
    }

    public static int[] shiftZeros2(int [] array){

        int start = 0;
        int end = array.length-1;
        while(start<end){
            if(array[start] == 1 && array[end] == 0){
                int a= array[start];
                array[start] = array[end];
                array[end] = a;
                start++;
                end--;
            }
            if(array[start] == 0) start++;
            if(array[end] == 1) end--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array  = {0,0,0,1,0,0,0};
        System.out.println(Arrays.toString(shiftZeros2(array)));
    }
}
