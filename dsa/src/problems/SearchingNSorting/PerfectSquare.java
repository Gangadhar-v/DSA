package problems.SearchingNSorting;


/*
Given an Integer,
 you have to count the return the perfect square numbers up to that integer
 */
public class PerfectSquare {

    public static int perfectSquareCount(int number){
        int count = 0;

        for(int i = 1;i*i<=number;i++){

                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(perfectSquareCount(100));
    }
}
