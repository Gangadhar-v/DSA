package problems.CapGemini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ScatterPalindrome {

    public static List<Integer> approach1(List<String> strToWord){

        String word = strToWord.get(0);
        int length = word.length();

        List<String> words = new ArrayList<>();

        for(int i = 0;i<length-1;i++){

            for(int j = i;j<length;j++){

                words.add(word.substring(i,j+1));

            }
        }

        int count = 0;
        boolean isScatter = false;
        for(String a:words) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(char i:a.toCharArray()){

                if(!hashMap.containsKey(i)){
                    hashMap.put(i,1);
                }else{
                    hashMap.put(i,hashMap.get(i)+1);
                }

                for(int value: hashMap.values()){

                    if(value %2 !=0){
                        isScatter = true;
                        break;
                    }
                }

            }
            if(isScatter){
                count++;
            }
        }
        List<Integer> output = new ArrayList<>();
        output.add(count);

        return output;

    }

    public static void main(String args[]){

        List<String> words = new ArrayList<>();
        words.add("aabb");
        System.out.println(approach1(words));
    }
}
