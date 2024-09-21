package problems.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
return the number of valid parentheses in the give parentheses

input -> String of parentheses
 */
public class ValidParentheses {

    public static int getValidParentheses(String A){

        Queue<Character>  queue = new LinkedList<>();
        char[] parentheses = A.toCharArray();
        for(char a:parentheses){
            if(a == '('){
                queue.add(a);
            }
        }
        int count = 0;
        for(char a:parentheses){
            if(a==')'){
                int size = queue.size();
                queue.poll();
                if(queue.size() == size-1){
                    count++;
                }
            }
        }




        return count*2;
    }
    public static void main(String args[]){
        System.out.println(getValidParentheses("()()())))"));
    }
}
