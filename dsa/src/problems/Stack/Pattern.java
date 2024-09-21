package problems.Stack;

import java.util.Stack;

/*
PROBLEM STATEMENT
input -> given pattern of A and D
output ->return number's(1,9) of length pattern+1

 */
public class Pattern {

    public static StringBuilder patter(String pat) {


        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int currentDigit = 1;
        for (int i = 0; i < pat.length(); i++) {
            stack.push(currentDigit++);

            if(pat.charAt(i) == 'A'){
                while(!stack.isEmpty()){
                    result.append(stack.pop());  //stack.pop removes the front element and returns it
                }
            }

        }
        result.append(stack.push(currentDigit));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(patter("DDADDAAD"));
    }
}
