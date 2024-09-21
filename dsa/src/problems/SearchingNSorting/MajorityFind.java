package problems.SearchingNSorting;

import kotlin.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input:
20 30 10 30 30

Output:
30

 */
public class MajorityFind {

    public static int majorityFind(List<Integer> Arr){

        //Key -> Element  , value -> Element count of majority element
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(Integer i:Arr){

            if(hashmap.containsKey(i)){
                hashmap.put(i,hashmap.get(i)+1);
            }else{
                hashmap.put(i,1);
            }
        }

      //return the key with maxValue;
       Integer maxKey = null;
       Integer maxValue = Integer.MIN_VALUE;

       for(Map.Entry<Integer,Integer> entry:hashmap.entrySet()){

           if(entry.getValue()>maxValue){
               maxValue = entry.getValue();
               maxKey = entry.getKey();
           }
       }

       return maxKey;
    }

    public static void main(String args[]){

        List<Integer> list = List.of(20, 30, 10, 30, 30);
        System.out.println(majorityFind(list));
    }
}
