package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrays {

    static ArrayList<ArrayList<Integer>> subArraysOfArray(ArrayList array){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for( int i = 0; i <= array.size() -1 ; i++){
            for( int j = i; j <= array.size()-1;j++){
                ArrayList arr =new ArrayList<>();
                for(int k = i; k<=j;k++){
                    arr.add(array.get(k));
                }
                result.add(arr);
            }
        }

        return result;
    }

    public static void main(String[] args){
        ArrayList<Integer> array = new  ArrayList(Arrays.asList(1,2,3,4,5));
        System.out.println(SubArrays.subArraysOfArray(array));
    }
}
