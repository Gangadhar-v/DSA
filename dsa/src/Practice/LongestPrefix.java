package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestPrefix {


    public static String findPrefix(List<String> words){

        words.sort( (w1,w2) -> Integer.compare(w1.length(),w2.length()));
        int length = words.get(0).length();

        StringBuilder result = new StringBuilder();

        String firstWord = words.get(0);

        for(int i = 0;i<length;i++){
            boolean contains = true;
            for(String word:words){
                char a = firstWord.charAt(i);
                if(a != word.charAt(i)){
                    contains = false;
                    break;
                }
            }
            if(contains){
                result.append(firstWord.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String args[]){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = input.nextInt();

        List<String> words = new ArrayList<>();
        for(int i = 0;i<size;i++){
            System.out.print("the word in the list");
            String word = input.next();
            words.add(word);
        }
        System.out.println(findPrefix(words));

    }
}
