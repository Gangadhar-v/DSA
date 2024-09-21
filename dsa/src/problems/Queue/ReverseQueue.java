package problems.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    /*
    1.first add the elements to queue
    2.then add the elements forms queue to array
    3.reverse the array and then add the element to queue

     */
   static Queue<Integer> reverseQueue(Queue<Integer> queue) {

       Stack<Integer> stack = new Stack<Integer>();
       while (!queue.isEmpty()){
           stack.add(queue.poll());
   }
       while(!stack.isEmpty()){
           queue.add(stack.pop());
       }

       return queue;

   }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(reverseQueue(queue));
    }


}
