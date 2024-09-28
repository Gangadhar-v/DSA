package problems.GeeksForGeeks.Arrays.Medium;


import java.util.Arrays;
import java.util.HashMap;

/*
PROBLEM STATEMENT
Input:  arr[]   = [10, 11, 12];
            index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
           index[] = [0,  1,  2]


Input:  arr[]   = [50, 40, 70, 60, 90]
          index[] = [3,  0,  4,  1,  2]
Output: arr[]   = [40, 60, 90, 50, 70]
          index[] = [0,  1,  2,  3,   4]

 */
public class ReOrderArray {

    public static int[] reOrderArray(int[] array, int[] index){

        int[] result = new int[index.length];
        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i = 0;i<index.length;i++){

            if(hashMap.containsKey(index[i])){
                hashMap.put(index[i],array[i]);
            }else{
                hashMap.put(index[i],array[i]);
            }
        }
        for(int i = 0;i<index.length;i++){
            result[i] = hashMap.get(i);
        }
        return result;

    }

    public static void main(String args[]){

        int[] array = {50, 40, 70, 60, 90};
        int[] index = {3,  0,  4,  1,  2};


        int[] array2  = {10, 11, 12};
        int[] index2 = {1, 0, 2};

        System.out.println(Arrays.toString(reOrderArray(array,index)));
        System.out.println(Arrays.toString(reOrderArray(array2,index2)));
    }
}
