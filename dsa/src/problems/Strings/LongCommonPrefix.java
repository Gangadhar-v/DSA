package problems.Strings;

import kotlin.text.Regex;

import java.util.Arrays;
import java.util.List;

public class LongCommonPrefix {

    public static String longestCommonPrefix(List<String> words){


        int minSize = Integer.MAX_VALUE;
        for(String word:words){
            int size = word.length();
            minSize = Integer.min(size,minSize);
        }

        StringBuilder result = new StringBuilder();


        //for loop length to access the elements in the word

        //for loop length to access the word in words

        int index = 0;  //this is index to access the

        String word = words.get(0);
       while(index<minSize){
           char character = word.charAt(index);
           boolean isPrefix = true;
            for(String a:words) {
                if (character != a.charAt(index)) {
                    isPrefix = false;
                    break;

                }
            }
                if(isPrefix){
                    result.append(character);
                }else {
                    break;
                }

                index++;


        }




        return result.toString();
    }

    public static void main(String args[]){

        List<String> words = List.of("flower","flow","flowting");
        System.out.println(longestCommonPrefix(words));

    }
}
