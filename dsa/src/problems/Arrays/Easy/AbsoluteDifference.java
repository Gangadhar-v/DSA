package problems.Arrays.Easy;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AbsoluteDifference {

    static void countDistinctElement(@NotNull int[] array){

        Set<Integer> set = new HashSet<Integer>() ;

        for(int i =0; i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                int result = Math.abs(array[i] - array[j]);
                set.add(result);
            }
        }
        for( int element:array){
            set.add(element);
        }

        System.out.println(set.size());

    }
    public static void main(String args[]){
        int[] array = {2, 6, 5};

         int[] array2 = {4,6,9,10};
        countDistinctElement(array2);
    }
}
