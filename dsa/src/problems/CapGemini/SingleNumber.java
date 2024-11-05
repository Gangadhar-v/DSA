package problems.CapGemini;

import java.util.HashMap;
import java.util.Map;

/*PROBLEM STATEMENT
input -> arr={4,3,2,4,1,3,2,5}
we have 1 and 5 has single number , so return smallest of it
output ->1
 */
public class SingleNumber {

    public static int approach1(int[] arr){

        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i:arr){
            if(!hashmap.containsKey(i)){
                hashmap.put(i,1);
            }else{
                hashmap.put(i,hashmap.get(i)+1);
            }
        }
        int smallNumber = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry:hashmap.entrySet()){

            if(entry.getValue() ==  1 && entry.getKey()<smallNumber){
                smallNumber = entry.getKey();
            }
        }

        return smallNumber;
    }

    /*
    PROBLEM STATEMENT
    return unique element in the arr
    input -> {4,1,2,1,2}
    output -> 4
     */
    public static int approach2(int[] arr){

        int result = 0;
        for(int i:arr){
            result =i^result ;

        }
        return result;
    }
    public static void main(String args[]){
        int[] arr = {4,3,2,4,1,3,2,5};
       // System.out.println(approach1(arr));

        int[] arr1 = {4,1,2,1,2};
        System.out.println(approach2(arr));
    }
}
