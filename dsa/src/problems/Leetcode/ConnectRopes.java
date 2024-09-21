package problems.Leetcode;


import java.util.PriorityQueue;
import java.lang.Integer;

/*
Problem Statement
Input:
Ropes: [4, 3, 2, 6]
Explanation:

Combine 2 and 3: Cost = 2 + 3 = 5, Remaining ropes = [4, 5, 6]
Combine 4 and 5: Cost = 4 + 5 = 9, Remaining ropes = [6, 9]
Combine 6 and 9: Cost = 6 + 9 = 15, Remaining ropes = [15]
Total cost = 5 + 9 + 15 = 29
 */

public class ConnectRopes {

    public static int connectRopes(int[] Ropes){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i:Ropes){
            minHeap.add(i);
        }
        int minCost = 0;
        while(minHeap.size() >1){
              minCost +=  combine(minHeap);
        }

        return minCost;
    }

    private static Integer combine(PriorityQueue<Integer> heap) {


            Integer min1 = heap.poll();
            Integer min2 = heap.poll();
            Integer sum = min1 + min2;

            heap.add(sum);

            return sum;

    }

    public static void main(String args[]){

        int[] ropes = {4, 3, 2, 6};
        System.out.println(connectRopes(ropes));
    }
}
