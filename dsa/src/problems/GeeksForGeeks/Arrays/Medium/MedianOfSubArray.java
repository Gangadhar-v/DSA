package problems.GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
PROBLEM STATEMENT
input: arr = {2, 3, 3}
Output: 5
Explanation:
Non-Empty Subsets of the given array are: { {2}, {3}, {3}, {2, 3}, {3, 3}, {2, 3, 3} }.
Possible sum of each subset are:
{ {2}, {3}, {3}, {5}, {6}, {8} }
Therefore, the median of all possible sum of each subset is 4.



 */
public class MedianOfSubArray {

    public static int medianSumOfSubArray(int[] arr){

       List<List<Integer>>  subArrays = new ArrayList<>();

       for(int i = 0;i<arr.length;i++){
           List<Integer> subArray = new ArrayList<>();
           for(int j = i;j<arr.length;j++){
               subArray.add(arr[j]);
               subArrays.add(new ArrayList<>(subArray));
           }

       }

       List<Integer> medianResults = new ArrayList<>();



      for(List<Integer> subArray:subArrays){
              medianResults.add(subArray.stream().mapToInt(Integer::intValue).sum());
      }

      Collections.sort(medianResults);
    return calMedium(medianResults);
    }

    public static int calMedium(List<Integer> subArray){
        int size = subArray.size();
        if(size %2 == 1){
            return subArray.get(size/2);
        }else{
            return (subArray.get(size/2 -1) + subArray.get(size/2)) /2;
        }
    }

    public static void main(String[] args) {
        int[] array = {2,3,3};
        System.out.println(medianSumOfSubArray(array));
    }
}
