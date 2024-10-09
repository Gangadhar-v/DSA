package problems.PrimeCoding;

/*
PROBLEM STATEMENT
Adam decides to do some charity work. From day 1 till day x, he will give i^2
coins to charity. On the day ‘i’ (1 < = i < = x), find the number of coins he
gives to charity.
 */

public class Coins {

    public static int getCoins(int days){

        int coinSum = 0;
        for(int i = 1;i<=days;i++){

            coinSum += i*i;
        }
        return coinSum;
    }

    public static void main(String args[]){
        System.out.println(getCoins(3));
    }

}
