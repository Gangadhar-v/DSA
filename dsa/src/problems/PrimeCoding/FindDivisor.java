package problems.PrimeCoding;


import java.util.ArrayList;
import java.util.List;

/*
M is divisor of N, if M divides N completely

 */
public class FindDivisor {

    public static List<Integer> findDivisors(int n){

        List<Integer> result = new ArrayList<>();
        for(int i = 1;i<=300;i++){
            if(n%i == 0){
                result.add(i);
            }
        }
        return result;
    }

    //OPTIMIZED ONE
    public static List<Integer> findDivisors2(int n){

        List<Integer> result = new ArrayList<>();
        for(int i = 1;i*i<n;i++){
            if(n%i == 0){
                result.add(i);

                if( i != n/i){
                    result.add(n/i);
                }
            }


        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(findDivisors2(30));
    }
}
