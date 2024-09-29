package problems.GeeksForGeeks.Arrays.SlidingWindow;


import java.util.List;

/*
Longest SubString with sum <= k
arr = {2,3,1,10,10}  k = 14

 */
public class DynamicWindowSize {

    public static int longestSubStringWithSum(List<Integer> arr,int k){

        int windowSum =0;
        int length = Integer.MIN_VALUE;
        int startIndex = 0;
        for(int endIndex = 0;endIndex<arr.size();endIndex++){

            windowSum += arr.get(endIndex);

            //adjust the window size util we get window size <=k
            // Shrink the window from the left if the sum exceeds 'k'
            while(windowSum>k){

                windowSum -= arr.get(startIndex);
                startIndex++;  // Move the left boundary right to shrink the window
            }

            if(windowSum <=k){
                length = Integer.max(length,endIndex - startIndex+1);
            }


        }

        return length;
    }

    public static void main(String args[]){

        List<Integer> arr = List.of(2,3,1,10,10);
        System.out.println(longestSubStringWithSum(arr,14));
    }
}
