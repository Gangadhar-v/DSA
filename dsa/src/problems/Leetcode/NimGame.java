package problems.Leetcode;
/*
Problem Explanation:
You are playing a variation of the Nim Game, where:

* There is a heap of stones on the table.
* You and your friend alternate turns.
* On each turn, a player can remove 1 to 3 stones from the heap.
* The player who removes the last stone wins the game.
* Both you and your friend play optimally, meaning you both try to win the game by making the best possible moves.
The task is to determine if you (the first player) can guarantee a win, given the number of stones n in the heap
 */

/* Approach
if stone = 1 or 2 or 3, you can remove it
if stone = 4 ,your friend will win, because u can remove up to 3 stone
if stone = 5,u will win when u remove 1 stone, remaining is 4, u r friend can remove up to max 3 stone
if stone = 6, u will win when u remove 2 stone, remaining is 4,
if stone = 7 , u will win when u remove 3 stone, remaining is 4
if stone = 8, u will lose even u remove 1,2,3 stone
 */
public class NimGame {

    public static boolean nimGame(int numberOfStones){

        return numberOfStones%4 != 0;
    }

    public static void main(String[] args) {
        System.out.println(nimGame(8));
    }
}
