package problems.Basic;


import java.util.ArrayList;

/*
the function should return the nth prime number
2,3,5,7,11,13,17,19,23,29
 */
public class Prime {

    //check up to sqrt of number
    public static boolean checkPrime(int number){
        int c= 2;
       if( number<=1) return false;

       while(c*c <= number){
           if(number%c == 0) return false;

           c++;
       }
        return true;
    }

   public static int nthPrime(int index){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int number = 2;
       while(primeNumbers.size()<index){
           if(checkPrime(number)){
               primeNumbers.add(number);
           }
           number++;


       }
       return primeNumbers.get(primeNumbers.size()-1);


   }

    public static void main(String[] args) {
        System.out.println(nthPrime(10));
        System.out.println(checkPrime(29));
    }
}
