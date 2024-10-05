package problems.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Separation {

    static List<Integer> separation(int[] array){
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0;i<array.length;i++){
            if(array[i]<0){
                neg.add(array[i]);
            }else pos.add(array[i]);
        }

        for(int element:neg){
            result.add(element);
        }
        for(int element:pos){
            result.add(element);
        }
       return result;
    }

    //Optimization Solution

    public static int[] separation2(int[] array){

        int[] result = new int[array.length];
        int start = 0;

        //arrange negative element
        for(int num:array){
            if(num<0){
                result[start++] = num;
            }
        }
        for(int num:array){
            if(num>0){
                result[start++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {20, -11, 30, -45, 50};
        System.out.println(Arrays.toString(separation2(array)));
    }
}
