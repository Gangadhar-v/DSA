package problems.Leetcode;

import java.util.Arrays;

/*
PROBLEM STATEMENT

construct Balanced Binary Tree;
9
1 3 2 4 5 7 6 8 9
Testcase Output
3 <- 5 -> 8
2 <- 3 -> 4
1 <- 2 -> .
. <- 1 -> .
. <- 4 -> .
7 <- 8 -> 9
6 <- 7 -> .
. <- 6 -> .
. <- 9 -> .


 */
public class BTS {

    public static class TreeNode{
        int value;
        TreeNode left,right;
        //constructor
        TreeNode(int value){
            this.value = value;
            left = right = null;
        }

        
    }

    public static TreeNode buildBTS(int[] array,int start, int end){


        //Base case
        if(start>end){
            return null;
        }

        int mid = (start+end) /2;
        TreeNode root = new TreeNode(array[mid]);
        root.left = buildBTS(array,start,mid-1);
        root.right = buildBTS(array,mid+1,end);

        return root;

    }

    public static void preOrderTraverse(TreeNode node){


        //Base case
        if(node == null){
            return;
        }
        //preOrderTraverse -> root left right
        int root = node.value;
        String left = (node.left != null)? String.valueOf(node.left.value) :".";
        String right = (node.right != null)? String.valueOf(node.right.value) :".";

        System.out.println(left+"<-" + root+"->"+right);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);


    }

    public static void main(String args[]){

        int[] array = {1, 3 ,2, 4, 5, 7, 6, 8, 9};
        Arrays.sort(array);
        preOrderTraverse(buildBTS(array,0,array.length-1));



    }
}
