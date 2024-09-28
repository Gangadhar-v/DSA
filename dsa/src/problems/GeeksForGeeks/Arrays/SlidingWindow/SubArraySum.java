package problems.GeeksForGeeks.Arrays.SlidingWindow;


/*PROBLEM STATEMENT
return maxSubArray Sum of size 2;
input array = {-1,2,3,1,-3,2}
output = 2+3 = 5;
 */

public class SubArraySum {

    public static int subArraySum(int[] arr,int size){


        int windowSize = size;
        int startIndex = 0;
        int endIndex = size;
        int sum = 0;
        for(int i = 0;i<windowSize;i++){
            sum += arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        while(endIndex<arr.length){

            maxSum = Integer.max(maxSum,sum);
            sum -= arr[startIndex++];
            sum += arr[endIndex++];
        }
        return maxSum == Integer.MAX_VALUE ? 0:maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,3,1,-3,2};
        System.out.println(subArraySum(arr,2));
    }
}
