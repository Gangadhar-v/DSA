package problems.PrimeCoding;

import java.util.Arrays;
import java.util.Scanner;

/*
PROBLEM STATEMENT
R -> Number of Rats
F -> Food required per each rat
H -> array of food available in each house
 */
public class isFoodSufficient {

    public static String isfoodSufficient(int Rats, int foodUnit, int[] houses ){

        int requiredFood = Rats*foodUnit;

        int foodAvailable = Arrays.stream(houses).sum();

        if(foodAvailable > requiredFood){
            return "Yes";
        }else{
            return "No";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of Rats:");
        int Rats = input.nextInt();
        System.out.print("Enter the food needed per each rat:");
        int foodUnit = input.nextInt();
        System.out.print("Enter the number of house");
        int N = input.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the food available in each house");
        for(int i = 0;i<N;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(isfoodSufficient(Rats,foodUnit,arr));
    }
}
