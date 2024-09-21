package problems.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DataAnalyst {

    static int dataAnalyst(int[] array){
        ArrayList<Integer> resultArray = new ArrayList();
        int sum = Arrays.stream(array).sum();
        int size = array.length;
        for(int i =0;i<array.length;i++) {
           if(sum<=size*array[i]){
               resultArray.add(array[i]);
           }


        }

        return Collections.min(resultArray);
    }

    // Most Efficient way
    static int dataAnalyst2(int[] array){

        int sum = Arrays.stream(array).sum();
        int minNum = Integer.MAX_VALUE;
        for( int num:array){
            if(sum<=array.length*num){
                minNum = Math.min(minNum,num);
            }
        }
        return minNum;
    }

    public static void main(String args[]){
        int [] array = {83 ,86, 77, 15, 93, 35, 86, 92, 49, 21};
        System.out.println(dataAnalyst(array));
    }
}
