package problems.Basic;

import java.util.ArrayList;

public class Fibonacci {

    //return first n fibonacci series Numbers

    public static ArrayList<Integer> nFibonacciNumbers(int n){

        //return first 10 or n fibonacci number
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
       while(result.size()<n){
           result.add(NthfibonacciNumber(index++));
       }
       return result;
    }


    public static int NthfibonacciNumber(int n){
        if(n==0) return 0;
        if(n == 1) return 1;

        if(n>=2){
            return NthfibonacciNumber(n-1)+NthfibonacciNumber(n-2);
        }
        return 0;
    }


    public static int specialFibonacci(int n){
        if(n == 0) return 1;
        if(n == 1 ) return 1;

        int result =specialFibonacci(n-1)*specialFibonacci(n-1) + specialFibonacci(n-2)*specialFibonacci(n-2) ;

        return result%47;


    }

    public static void main(String[] args) {
//        System.out.println(nFibonacciNumbers(10)); //the 7th fibonacci is 13
        System.out.println(specialFibonacci(5));
    }
}
