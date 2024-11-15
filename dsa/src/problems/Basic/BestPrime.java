package problems.Basic;


import java.util.ArrayList;

/*

Return prime numbers that are less than givenNumber
 */
public class BestPrime {

    public static ArrayList<Integer> bestPrime(int number){
        int currentNumber = 2;
        ArrayList<Integer> result = new ArrayList<>();
        while(currentNumber<number){
            if(isPrime(currentNumber)){
                result.add(currentNumber);
            }
            currentNumber++;
        }
        return result;
    }

    public static boolean isPrime(int n){
        int i = 2;
        if(n==0) return false;
        if(n<=1) return false;
        while(i*i<=n){
                if(n%i == 0) return false;

                i++;
            }
            return true;
        }

        public static void main(String[] ars){
            System.out.println(isPrime(13));
            System.out.println(bestPrime(8));
        }
    }

