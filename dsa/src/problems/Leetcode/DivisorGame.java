package problems.Leetcode;

/*PROBLEM STATEMENT
there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

Choosing any x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.

Example 1:
Input: n = 2
Output: true
Explanation: Alice chooses 1, and Bob has no more moves.

Example 2:
Input: n = 3
Output: false
Explanation: Alice chooses 1, leaving n = 2, then Bob chooses 1, and Alice has no more moves.
 */

/*
SOLUTION

if n is even, then alice wins, by always choosing x = 1
if n is odd, then bob will win
 */


public class DivisorGame {

    public static boolean divisorGame(int n) {
        return n%2 == 0;
    }

}
