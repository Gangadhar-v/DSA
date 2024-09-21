package problems.SearchingNSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
The function should return first and last occurrence of the given number in the array of integer
 */
public class FindFirstAndLast {

    public static List<Integer> findFirstAndLast(List<Integer> A, int e){

       int start  = 0;
       int end = A.size()-1;
       List<Integer> result = new ArrayList<>();

        //finding the first occurrence
        while(start<end){

            if(A.get(start) == e){
                result.add(start);
                break;
            }else{
                start++;
            }
        }

        while(end>=start){
            if(A.get(end) == e){
                result.add(end);
                break;
            }else{
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 30, 50, 50, 50, 50, 67, 123, 125));
        System.out.println(findFirstAndLast(numbers,50));
    }
}
