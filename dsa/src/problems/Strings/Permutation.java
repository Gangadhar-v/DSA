package problems.Strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public  static List<List<Integer>> permute(int[] nums){

        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList,new ArrayList<>(),nums);
        return resultList;
    }

    public static void backtrack(List<List<Integer>> resultList,ArrayList<Integer> templist,int[] nums){

        if(templist.size() ==  nums.length){
            resultList.add(new ArrayList<>(templist));
            return;
        }

        for(int element:nums){

            //Skip if we get same element;
            if(templist.contains(element))
                continue;

            //Add the new element
            templist.add(element);

            //Go back to try other element
            backtrack(resultList,templist,nums);

            //Remove the element
            templist.remove(templist.size()-1);
        }

    }

    public static void main(String args[]){
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }

}
