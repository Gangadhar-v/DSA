package problems.Basic;

/*
function return lcm of n1,n2,n3

 */
public class LCM {

    public static int calculateLcm(int a,int b, int c){
        int result1 = lcm(a,b);
        return lcm(result1,c);
    }
    public static int lcm(int n,int m) {
        return n*(m/gcd(n,m));

    }

    public static int gcd(int a, int b){


        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        System.out.println(calculateLcm(25,50,100));
    }

}
