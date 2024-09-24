package problems.Basic;

/*
    10
   /  \
  5   20
 / \
2   8


 */
public class isBanaryTree {
    public static class TreeNode{

        int value;
        TreeNode right,left;
        TreeNode(int value,TreeNode left, TreeNode right){
            this.value = value;
            this.left = left ;
            this.right = right;
        }
        TreeNode(int value){
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean isbinaryTree( TreeNode node){

//Basecase
        if(!isSubTreeLesser(node,node.left.value)){
            return true;
        }
        if(isSubTreeGreater(node,node.right.value)){
            return true;
        }

        return isbinaryTree(node.left) && isbinaryTree(node.right);

    }

    public static boolean isSubTreeLesser(TreeNode root, int value){
        if(root == null){
            return true;
        }

        if(root.value <= value) return true;
        return isSubTreeLesser(root.left,value)&&isSubTreeLesser(root.right,value);
    }
    public static boolean isSubTreeGreater(TreeNode root,int value){
        if(root == null){
            return true;
        }
        if(root.value >= value){
            return true;
        }
        return isSubTreeGreater(root.left,value) && isSubTreeGreater(root.right,value);
    }

    public static void main(String args[]){


        TreeNode right = new TreeNode(20);
        TreeNode n2 = new TreeNode(2);
        TreeNode n8 = new TreeNode(8);
        TreeNode left = new TreeNode(5,n2,n8);
        TreeNode root = new TreeNode(10,left,right);


       System.out.println(isbinaryTree(root));
    }
}
