package problems.GeeksForGeeks.Arrays.Easy;


import java.util.Arrays;
import java.util.Scanner;

/*
PROBLEM STATEMENT
Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23


Input: arr[] = { 6, 8, 9, 2, 1, 10}
Output: 10, 8, 9

 */
public class LargeThreeElements {

    public static void largeThreeElements(int[] arr){

        int first ,second,third ;

        first = second = third =  Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){

            if(arr[i]>first){

                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i]>second){
                third = second;
                second = arr[i];
            } else if(arr[i]>third){
                third = arr[i];

            }
        }
        System.out.println("First , Second and Third Elements are:" + first +" "+" "+second+" "+third);

    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int N = input.nextInt();
        System.out.print("Enter the array elements:");
        int[] arr = new int[N];
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        largeThreeElements(arr);

    }
}
