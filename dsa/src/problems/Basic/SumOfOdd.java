package problems.Basic;

import java.util.Scanner;

public class SumOfOdd {

    public static int sumOfOdd(int[] arr){

        int sum = 0;
        for(int i = 0;i<arr.length;i++){

            if(arr[i]%2 !=0){
                sum +=arr[i];
            }
        }
        return sum;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        System.out.println("Enter the element in the array");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(sumOfOdd(arr));

    }
}
