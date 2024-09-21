package problems.Leetcode;

import java.util.Arrays;

/*Problem Statement  "Reverse Image"
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class ReverseImage {

    public static int[][] reverseImage(int[] [] image){

        for(int row = 0;row<image.length;row++){
            int[] r = image[row];
           image[row] =flipRow(swapRow(r));

        }


       return image;
    }

    public static int[] swapRow(int[] arr){

        int end = arr.length-1;
        int start = 0;

        while(start<=end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }



        return arr;

    }

    public static int[] flipRow(int[] arr){

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

        return arr;
    }

    public static void main(String agrs[]){

        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

       int[][] r = reverseImage(image);

       for(int[] row:r){
           System.out.print(Arrays.toString(row));
       }
    }
}
