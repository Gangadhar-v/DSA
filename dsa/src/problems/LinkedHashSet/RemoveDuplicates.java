package problems.LinkedSet;

import java.util.LinkedHashSet;
/*
PROBLEM STATEMENT
remove duplicates while preserving the order
input = "programming"
output = "progamin"
 */

//LinkedHashSet to maintain the insertion order
public class RemoveDuplicates {

    public static String removeDuplicates(String word){

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(char i:word.toCharArray()){
            set.add(i);
        }

        for(char i:set){
            result.append(i);
        }

        return result.toString();
    }

    public static void main(String args[]){
        System.out.println(removeDuplicates("programming"));
    }
}
