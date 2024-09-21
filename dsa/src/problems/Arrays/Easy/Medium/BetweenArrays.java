package problems.Arrays.Easy.Medium;

public class BetweenArrays {

    /*TODO INCOMPLETE PROBLEM*/
    public static int betweenArrays(int[] a, int[] b){

        //Calculation the LCM of the array a
        int currentLcm = a[0];
        for( int i = 1;i<a.length;i++){
            currentLcm = lcm(currentLcm,a[i]);
        }
        //Calculate the GCD  of the array b
        int currentGcd = b[0];
        for(int i = 1;i<a.length;i++){
            currentGcd = gcd(currentGcd,b[i]);
        }

        return 0;

    }
    public static int lcm(int a, int b){
        return a*(b/gcd(a,b));
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
