package problems.GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
PROBLEM STATEMENT
Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
              11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
         11, 12, 13, 14, 15, 16, 17, 18, 19]

 */
public class RearrangeArray {

    public int[] approach1(int[] arr){

        Arrays.sort(arr);

        int maxVal = arr[arr.length-1];

        HashSet<Integer> set = new HashSet();
        for(int i :arr){
            set.add(i);
        }


        int[] result = new int[maxVal+1];

        for(int num = 0;num<=maxVal;num++){

            if(set.contains(num)){
                result[num] = num;

            }else{
                result[num] = -1;
            }
        }

        return result;

    }

    public static int[] approach2(int[] arr){

       //find maxElement in arr
        Arrays.sort(arr);
        int size = arr[arr.length-1];
        int[] result = new int[size+1];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<arr.length;i++){


            if(hashMap.containsValue(arr[i])){
                hashMap.put(i,arr[i]);
            }else{
                hashMap.put(i,arr[i]);
            }
        }
        for(int index =0;index<=size;index++){

            if(hashMap.containsValue(index)){
                result[index] = index;
            }else{
                result[index] = -1;
            }

        }
        return result;

    }


    public static void main(String args[]){

        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1,12};
        System.out.println(Arrays.toString(approach2(arr)));
        int[] arr1 ={19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4,21};
        System.out.println(Arrays.toString(approach2(arr1)));
    }
}
