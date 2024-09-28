package problems.Leetcode;


/*

Team A has set a target of N-1 runs.
Team B's goal is to score exactly N-1 runs to win.
 You are being given an array of length N,
  where each element represents the maximum number of runs Team B can score on that particular ball.

Team B will play one ball at a time and can score anywhere between 0 and the value given in the array for that ball.
The total number of balls Team B plays will equal the total number of runs they score.
Starting from the first ball (index 0), your task is to determine if Team B can score exactly N-1 runs by selecting appropriate runs from each ball.
You need to return true if Team B can score exactly N-1 runs, or false if it is not possible.


 */

/* THIS IS WRONG SOLUTION, BECAUSE IT DOESN'T PASS ALL TEXT CASES */
public class CricketMatch {

    public static boolean canScoreExactlyNMinusOneRuns(int N, int[] scores) {

        int targetScore = N-1;
        int currentScore = 0;
        int ballFaced = 0;

        for(int ballNo = 0;ballNo<targetScore;ballNo++){

            if(scores[ballNo] != 0){
                currentScore = currentScore+1;
                ballFaced++;
            }else{
                currentScore = currentScore+0;
                ballFaced++;
            }


        }

        return currentScore == targetScore && ballFaced == targetScore;

    }

    public static void main(String args[]){

        int[] scores = {3, 2, 2, 1, 4};
        int[] scores2 = {3, 2, 1, 0, 4};
        System.out.println(canScoreExactlyNMinusOneRuns(5,scores));
        System.out.println(canScoreExactlyNMinusOneRuns(5,scores2));

    }
}
