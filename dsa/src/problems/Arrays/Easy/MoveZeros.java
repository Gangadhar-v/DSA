package problems.Arrays.Easy;

import java.util.Arrays;

public class MoveZeros {
    /*
    input = [0,1,0,3,12]
    output = [1,3,12,0,0]
     */

    static int[] moveZeros(int[] arr){
        int index = 0;

        for(int i = 0;i< arr.length;i++){
            if(arr[i] !=0){
                arr[index++] = arr[i];
            }
        }
        int num = 0;
        while(index<arr.length){
            arr[index++] = 0;
        }


        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}
