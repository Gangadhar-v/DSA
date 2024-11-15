package problems.CapGemini;

import java.util.ArrayList;

public class RunningSum {

    public static void runningSum(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int sum = arr[0];
        result.add(sum);
        for(int i = 1;i<arr.length;i++){
            sum = sum+arr[i];
            result.add(sum);
        }
        System.out.println(result);
    }
    
}
