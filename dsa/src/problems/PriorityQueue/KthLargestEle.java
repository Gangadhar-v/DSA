package problems.PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestEle {

    public static int kthLargestElement(int[] arr,int k){

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a,b)->b-a
        );

        for(int i:arr){
            maxHeap.add(i);
        }
        int kthElement = 0;
        for(int i = 0;i<k;i++){
            kthElement = maxHeap.poll();
        }

        return kthElement;
    }

    public static int approach2(int[] arr, int  k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i :arr){
            minHeap.add(i);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String args[]){
        int[] arr = {3,2,1,5,6,4};
        System.out.println(kthLargestElement(arr,2));
        System.out.println(approach2(arr,1));
    }
}
