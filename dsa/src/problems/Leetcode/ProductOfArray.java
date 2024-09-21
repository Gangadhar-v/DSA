package problems.Leetcode;

import java.util.ArrayList;


public class ProductOfArray {


    public static ArrayList<Integer> productOfArray(int[] nums){


       ArrayList<Integer> result = new ArrayList<>();
       for(int i = 0;i<nums.length;i++){
           int index = 0;
           int product = 1;
           while(index<nums.length){

               if(index !=i){
                   product = product*nums[index];
               }
//               else{
//                   continue;
//               }
               //the continue statement skips the entire code below
               index++;

           }
           result.add(product);

           }

           return result;
       }

    public static void main(String[] args) {
        System.out.println("output");
        int[] a= {1,2,3,4};
        System.out.println(productOfArray(a));
        System.out.println("output");
    }

    }

