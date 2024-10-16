package problems.Strings;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WithOutRepeating {

    public static int withOutRepeating(String str){

        List<String> result = new ArrayList<>();
      StringBuilder set = new StringBuilder();
      set.append(str.charAt(0));

      for(int i = 1;i<str.length();i++){

          if(!set.toString().contains(""+str.charAt(i))){
              set.append(str.charAt(i));
          }else{
              result.add(set.toString());
              set = new StringBuilder();
              set.append(str.charAt(i));
          }
      }
      result.add(set.toString());
      int maxSize = Integer.MIN_VALUE;

      for(String a:result){
          int size = a.length();
          maxSize = Integer.max(size,maxSize);
      }

      return maxSize;
    }

    //using sliding window
    public static int approach2(String str){
        HashSet<Character> charSet = new HashSet<>();

        int start = 0;
        int maxLength = 0;
        for(int end = 0;end<str.length();end++){

            char currentChar = str.charAt(end);

            while(charSet.contains(currentChar)){
                charSet.remove(str.charAt(start));
                start++;
            }
            charSet.add(currentChar);

            maxLength = Math.max(maxLength,end-start+1);

        }
        return maxLength;
    }


    public static void main(String args[]){
        String a = "abcabcbb";
        System.out.println(approach2(a));
    }
}
