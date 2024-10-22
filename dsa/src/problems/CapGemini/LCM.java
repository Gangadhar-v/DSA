package problems.CapGemini;

import java.util.ArrayList;
import java.util.Scanner;

/*
PROBLEM STATEMENT
array ={1,2,3,4}
set S= {lcm(1,2},lcm(2,3},lcm(3,4)}  = {2,6,12}  . the largest Element is 12

 */
public class LCM {

    public static int largestLcm(int[] arr){


        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            result.add(lcm(arr[i],arr[i+1]));

        }

        int max = 0;
        for(int i :result){
            if(i>max){
                max = i;
            }
        }

        return max;
    }

    public static int lcm(int a,int b){

        return Math.abs(a*b)/gcd(a,b);
    }

    public static int gcd(int a,int b){

        if(b == 0) return a;
        else{
            return gcd(b,a%b);
        }
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(largestLcm(arr));
    }
}
