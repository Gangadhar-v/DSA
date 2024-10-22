package problems.PriorityQueue;

import java.util.PriorityQueue;

/*
PROBLEM STATEMENT
You are given n ropes of different lengths. You need to connect these ropes into one rope.
The cost to connect two ropes is equal to the sum of their lengths.
 Return the minimum cost to connect all the ropes.

Example:

Input: ropes = [1, 2, 3, 4, 5] -> [3],3,4,5 -> [6],4,5-> [10],5 -> [15]   = 3+6+10+15 = 33;
Output: 33

 */
public class MinimumCost {

    public static int minimumCost(int[] arr){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i:arr){
            minHeap.add(i);
        }

        int totalCost = 0;
        while(minHeap.size()>1){
            int first = minHeap.poll();
            int second = minHeap.poll();

            int currentCost = first+second;

            totalCost += currentCost;

            minHeap.add(currentCost);
        }

        return totalCost;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};

        System.out.println(minimumCost(arr));
    }
}
