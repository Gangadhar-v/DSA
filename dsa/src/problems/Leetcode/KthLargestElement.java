package problems.Leetcode;

import java.util.PriorityQueue;

/*
PROBLEM STATEMENT
Input:
["KthLargest", "add", "add", "add", "add", "add"]

[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]

Output: [null, 4, 5, 5, 8, 8]

Explanation:

KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
kthLargest.add(3); // return 4
kthLargest.add(5); // return 5
kthLargest.add(10); // return 5
kthLargest.add(9); // return 8
kthLargest.add(4); // return 8


 */
public  class KthLargestElement {

    private PriorityQueue<Integer> minHeap;
    private int kth;

    public KthLargestElement(int k, int[] nums) {
        kth = k;
        minHeap = new PriorityQueue<>();

        for(Integer i:nums){
           add(i);
        }


    }

    public int add(int val) {

        minHeap.offer(val);

        if(minHeap.size()>kth){
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 8, 2};
        KthLargestElement k = new KthLargestElement(3,nums);
        System.out.println(k.add(3));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }
}
