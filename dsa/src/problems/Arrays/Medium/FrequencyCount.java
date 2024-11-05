package problems.Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {

    public static int approach1(int[] arr){

        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i:arr){

            if(!hashmap.containsKey(i)){
                hashmap.put(i,1);
            }else{
                hashmap.put(i,hashmap.get(i)+1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int minKey = Integer.MAX_VALUE;

        List<Integer> keys = new ArrayList<>();

        for(int value:hashmap.values()){
            maxValue = Integer.max(value,maxValue);
        }

        for(Map.Entry<Integer,Integer> entry:hashmap.entrySet()){



            if(entry.getValue() == maxValue){
                keys.add(entry.getKey());
            }

        }

        for(int i:keys){
            minKey = Integer.min(i,minKey);
        }

        return minKey;

    }
}

