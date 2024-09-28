package problems.GeeksForGeeks.Arrays.Easy;


import java.util.Scanner;

/*
PROBLEM STATEMENT
count the possible number of subArrays and subSequence Array of the given Array

*A subArray is the contiguous part of array
*A subSequence is a sequence that can be derived form another sequence,
 by removing zero or more elements without changing the order of the remaining elements

 */
public class CountSubAndSubseq {

    public static void countSubAndSubseq(int N){


        int subArray = (N)*(N+1) / 2;
        double subSequence = Math.pow(2,N);
        System.out.println("Number of SubArrays are: "+subArray);
        System.out.println("Number of SubSequenceArrays are: "+subSequence);


    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number size of The array");
        int N = input.nextInt();
        countSubAndSubseq(N);
    }
}
