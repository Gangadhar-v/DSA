package problems.Queue;
//give double ended queue which acts like dynamic Array

/*
Problem Statement -> select only corner elements i.e; start++ or end-- elements to get the maxSum
 */
public class MaxCornerSum {

    //K is the number of elements to be selected from the corner of the maximum sum
    static int getMaxCornerSum(int[] arr, int N, int K){

        int maxSum = 0;

        for(int i = 0;i<=K;i++){
            int sum = 0;
            //selecting starting elements
            for(int start = 0;start<i;start++){
                sum += arr[start];
            }
            //selecting end elements
            for(int end = 0;end<K-i;end++){
                sum+=arr[N-1-end];  //as end pointer increase
            }

            if(sum>maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String args[]){

        int[] array = {8, 4, 4, 8, 12, 3, 2, 9 };
        int K = 3;
        int size = 8;
        System.out.println(getMaxCornerSum(array,K,size));

    }
}
