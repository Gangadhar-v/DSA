package problems.Strings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.lang.StringBuilder;

/*
PROBLEMS STATEMENT
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagram(List<String> strings){



        List<List<String>> result  = new ArrayList<>();
        List<String> words= new ArrayList<>(strings);


        while(!words.isEmpty()){

            String word =words.remove(0);
            ArrayList<String> anagrams = new ArrayList<>();
            anagrams.add(word);

            Iterator<String> it = words.iterator();
            while(it.hasNext()){
                String currentWord = it.next();
                if(isAnagram(word,currentWord)){
                    anagrams.add(currentWord);
                    it.remove();
                }
            }
            result.add(anagrams);

        }

        return result;

    }


    public static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()) return false;

        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for(int i = 0;i<str1.length();i++){

            array1[str1.charAt(i)-'a']++;
            array2[str2.charAt(i)-'a']++;

        }
        return Arrays.equals(array1,array2);
    }

    public static void main(String args[]){

        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        System.out.println(groupAnagram(words));
    }
}
