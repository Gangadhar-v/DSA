package problems.Basic;

public class NearestPowOf2 {

    public static double nearestPowOf2(int i){

        int expo = 0;
        double result = Math.pow(2,expo);
        //find the nearest power of 2 to the number i
        while(Math.pow(2,expo) <=i){
            expo++;



        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nearestPowOf2(5));
    }
}
