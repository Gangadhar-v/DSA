package problems.PrimeCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(int[] arr){

      HashSet<Integer> set = new LinkedHashSet<>(); //it stores in elements in order of insertion,
         //we can also use HashSet , which does not store the elements in the order of insertion

      for(int element:arr){
          set.add(element);
      }
      return new ArrayList<>(set);

    }

    public static void main(String args[]){

        int[] arr = {1,2,2,2,3,4,5,5};
        System.out.println(removeDuplicates(arr));
    }
}
