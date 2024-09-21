package problems.Basic;

/*
Input:

3 // value of k

Output:

1.875000 // geometric sum up to 5 decimal places
 calculated as: 1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.875
 */
public class SeriesSum {

    static double seriesSum(int k){
        if( k == 0)
            return 1;
        else{
            return 1/Math.pow(2,k)+seriesSum(k-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.5f",seriesSum(3)));
    }
}
