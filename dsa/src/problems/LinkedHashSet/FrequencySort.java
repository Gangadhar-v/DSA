package problems.LinkedHashSet;

import java.util.*;

public class FrequencySort {

    public static String frequencySort(String word){

        LinkedHashMap<Character,Integer> hashmap = new LinkedHashMap<>();

        for(char i:word.toCharArray()){
            if(!hashmap.containsKey(i)){
                hashmap.put(i,1);
            }else{
                hashmap.put(i,hashmap.get(i)+1);
            }
        }

       PriorityQueue<Map.Entry<Character,Integer>> maxheap = new PriorityQueue<>(
               (entry1,entry2)->Integer.compare(entry2.getValue(),entry1.getValue())
       );

        maxheap.addAll(hashmap.entrySet());

        StringBuilder result = new StringBuilder();
        while(!maxheap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxheap.poll();
            char c = entry.getKey();
            int frequency = entry.getValue();
            result.append(String.valueOf(c).repeat(frequency));
        }
        return result.toString();
    }

    public static void main(String args[]){

        String word = "tree";
        System.out.println(frequencySort(word));
    }
}
