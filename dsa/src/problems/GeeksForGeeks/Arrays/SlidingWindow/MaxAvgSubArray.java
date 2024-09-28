package problems.GeeksForGeeks.Arrays.SlidingWindow;


import java.util.Scanner;

/*
PROBLEM STATEMENT
input array = {1,12,-5,-6,50,3} , k = 4

maximum average of subArray is 12 + -5 + -6 + 50 + 3 = 12.75


 */
public class MaxAvgSubArray {

    public static double maxAvgSubArray(int[] arr,int k){

        int sum = 0;


        for(int i = 0;i<k;i++){
            sum +=arr[i];
        }
       int maxSum =sum;

        int startIndex = 0;
        int endIndex =k;

        while(endIndex<arr.length){

            sum -= arr[startIndex];
            startIndex++;
            sum += arr[endIndex];
            endIndex++;

            maxSum = Integer.max(maxSum,sum);
        }

        return (double) maxSum/k;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

//        System.out.print("Enter the value of k:");
//        int k = input.nextInt();
//        System.out.print("Enter the size of the array");
//        int size = input.nextInt();
//        System.out.print("Enter the elements for array");
//        int[] arr = new int[size];
//        for(int i = 0;i<size;i++){
//            arr[i] = input.nextInt();
//        }
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(maxAvgSubArray(arr,4));

    }
}
