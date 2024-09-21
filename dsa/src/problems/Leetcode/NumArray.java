package problems.Leetcode;


import java.util.Arrays;

/*
PROBLEM STATEMENT
Input
["NumArray", "sumRange", "update", "sumRange"]
[[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
Output
[null, 9, null, 8]

Explanation
NumArray numArray = new NumArray([1, 3, 5]);
numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
numArray.update(1, 2);   // nums = [1, 2, 5]
numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8



 */
public class NumArray {

    private int[] array;

    //constructor
    public NumArray(int[] nums) {

        int size = nums.length;
        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = nums[i];
        }
    }

    public void update(int index, int val) {
        array[index] = val;
    }

    public int sumRange(int left, int right) {

        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += array[i];
        }

        return sum;
    }


    /*
     Time Complexity optimization
    Creating segmented tree(binary tree),
     in which all leaf node contains the values of array

     */


        public static void main(String[] args) {
            int[] nums = {1, 3, 5};
            NumArray numArray = new NumArray(nums);
            System.out.println(numArray.sumRange(1,2));


        }
    }

