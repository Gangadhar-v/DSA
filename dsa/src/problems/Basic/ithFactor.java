package problems.Basic;

import java.util.ArrayList;


/*
Factors are the number which divides the number completely
 */
public class ithFactor {

    public static int factor(int number, int index){

        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 1;i<=10;i++){
            if(number%i == 0) array.add(i);

        }

        return array.get(index-1);

    }

    public static void main(String args[]){
        System.out.println(factor(10,3));
    }
}
