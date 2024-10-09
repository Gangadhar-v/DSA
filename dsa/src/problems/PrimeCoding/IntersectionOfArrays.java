package problems.PrimeCoding;

import java.util.*;

public class IntersectionOfArrays {


    public static List<Integer> intersection(int[] arr1, int[] arr2){



        List<Integer> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for(int i= 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int element:arr2) {
            if (set.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7};
        System.out.println(intersection(arr1,arr2));
    }
}
