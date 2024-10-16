package problems.CapGemini;


import java.util.Arrays;
import java.util.Scanner;

/*

PROBLEM STATEMENT

There are n available seats and n students standing in a room.
 You are given an array seats of length n,
 where seats[i] is the position of the ith seat.
 You are also given the array students of length n, where students[j] is the position of the jth student.

 Input: seats = [3,1,5], students = [2,7,4]
Output: 4
Explanation: The students are moved as follows:
- The first student is moved from position 2 to position 1 using 1 move.
- The second student is moved from position 7 to position 5 using 2 moves.
- The third student is moved from position 4 to position 3 using 1 move.
In total, 1 + 2 + 1 = 4 moves were used.
 */
public class MinimumMovesToSeat {

    public static int minMovesToSeat(int[] seats,int[] students){

        Arrays.sort(seats);
        Arrays.sort(students);
        int moveCount = 0;

        for(int i = 0;i<students.length;i++){
            int move = Math.abs(students[i] - seats[i]);
            moveCount+=move;
        }
        return moveCount;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of seats array:");
        int N = input.nextInt();
        System.out.println("Enter the seats numbers:");

        int[] seats =new int[N];
        for(int i = 0;i<N;i++){
            seats[i] = input.nextInt();
        }
        System.out.println("Enter the size of Students:");
        int M = input.nextInt();
        System.out.println("Enter the student standing positions");

        int[] students = new int[M];
        for(int i = 0;i<M;i++){
            students[i] = input.nextInt();
        }
        System.out.println(minMovesToSeat(seats,students));

    }

}
