package problems.GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {

   public static int secondLargestElement(int[] arr){

       Arrays.sort(arr);
       for(int i = arr.length-2;i>=0;i++){
           if(arr[i] != arr[arr.length-1]){
               return arr[i];
           }
       }
       return -1;
   }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int N = input.nextInt();
       int[] arr = new int[N];
       for(int i =0;i<N;i++){
           arr[i] = input.nextInt();
       }
        System.out.println(secondLargestElement(arr));
       
    }
}
