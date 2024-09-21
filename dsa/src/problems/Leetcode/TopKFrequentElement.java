package problems.Leetcode;


import java.util.*;

/*
Problem Statement
input ->nums = [1, 1, 1, 2, 2, 3], k = 2
output -> [1, 2]
 */
public class TopKFrequentElement {


    //PriorityQueue
    //use minHeap -> poll the heap until the size of heap is k

    public static List<Integer> topKElements(List<Integer> nums, int k){

        //create a minHeap
        PriorityQueue <Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(
                (entry1,entry2) -> Integer.compare(entry2.getValue(),entry1.getValue())
        );

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(Integer i:nums){
            if(!hashMap.containsKey(i)){
                hashMap.put(i,1);
            }else{
                hashMap.put(i,hashMap.get(i)+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            maxHeap.add(entry);
        }

      List<Integer> topkelement = new ArrayList<>();
        for(int i = 0;i<k;i++){
            topkelement.add(maxHeap.poll().getKey());
        }


        return topkelement;

    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,3,3,4,4,4,4,4,5,5,5,5,7,8,8,8,8,8);
        System.out.println(topKElements(nums,3));
    }
    
    }

