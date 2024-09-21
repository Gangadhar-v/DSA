package problems.Arrays.Easy.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseQueries {

    public static List<Integer> reverseQueries(List<Integer> array, List<Integer> queries){



        for(int query = 0;query<queries.size();query=query+2){

            //reversing the array index form query to query+1
            int start = queries.get(query);
            int end = queries.get(query+1);

            while(start<end){
                int temp = array.get(start);
                array.set(start,array.get(end));
                array.set(end,temp);
                start++;
                end--;
            }

        }

        return array;
    }

    public static List<Integer> reverseArray(List<Integer> array){
        int start = 1;
        int end = 3;
        while(start<end){
            int temp = array.get(start);
            array.set(start,array.get(end));
            array.set(end,temp);
            start++;
            end--;
        }

        return array;
    }

    public static void main(String[] args) {
        List<Integer> array = new  ArrayList(Arrays.asList(5, 3, 2, 1, 3));
        List<Integer> queries = new  ArrayList(Arrays.asList(0,1, 1, 3));
        System.out.println(reverseQueries(array,queries));
    }
}
