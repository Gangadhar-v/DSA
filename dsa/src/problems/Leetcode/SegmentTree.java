package problems.Leetcode;

import java.util.Arrays;


public class SegmentTree {

    private int[] segmentTree;
    private int size;

    public SegmentTree(int[] nums) {
        size = nums.length;
        if (size > 0) {
            segmentTree = new int[2 * size];

            buildSegmentTree(nums);
        }
    }

    private void buildSegmentTree(int[] nums) {
        //inserting elements in the second half of the segmented tree
        for (int i = 0; i < size; i++) {

            segmentTree[size + i] = nums[i];
        }
//filling first half by summing their left and right node values
        for (int i = size - 1; i > 0; i--) {


            //        rootNode         leftChild           RightChild
            segmentTree[i] = segmentTree[i * 2] + segmentTree[i * 2 + 1];
        }

        //Building the tree by summing up the elements


    }
    public void printSegmentTree() {
        System.out.println("Segment Tree Array:");
        for (int value : segmentTree) {
            System.out.print(value + " ");
        }
        System.out.println();  // Move to the next line after printing all elements
    }

    public static void main(String[] args) {

        int[] nums = {1,3,5};
        SegmentTree s = new SegmentTree(nums);
       s.printSegmentTree();
    }
}
