package problems.Strings;

import java.util.HashMap;

/*
PROBLEM STATEMENT
input = "swiss"
output = 'w'
*/
public class NonRepeatingChar {

    public static char approach1(String word){

        HashMap<Character,Integer> hashmap = new HashMap<>();

        for(char i:word.toCharArray()){
            if(!hashmap.containsKey(i)){
                hashmap.put(i,1);
            }else{
                hashmap.put(i,hashmap.get(i)+1);
            }
        }

        for(char i:word.toCharArray()){
            if(hashmap.get(i) == 1){
                return i;

            }
        }
        return '\0';  // '/0' represents the null char
    }
    public static void main(String args[]){
        String word = "swiss";
        System.out.println(approach1(word));
    }
}
