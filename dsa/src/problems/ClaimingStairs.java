package problems;

/*
  Find the number of ways to reach the top of the stair
  1.using 1 step
  2.using 2 step
 */
public class ClaimingStairs {

    static int claimingStairs(int num){  //8

        if(num == 1) return 1;
        int[] dp = new int[num+1]; //0 1 2 3 4 5 6 7 8
        dp[0] = 0; //Base case:No ways to reach step 0
        dp[1] = 1; //Base case:1 ways to reach step 1
        dp[2] = 2; //Base case:2 ways to reach step 2

        for(int i = 3; i<=num;i++){  // 3 to 8
            dp[i] = dp[i-1] + dp[i-2];
        }


        return dp[num];
    }

    public static void main(String[] args) {
        System.out.println(claimingStairs(4));
    }
}
