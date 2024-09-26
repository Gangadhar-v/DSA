package problems.Leetcode;

import java.util.List;

public class MatchCounting {

    public static int countMatching(int N, List<String[]> items, String ruleKey, String ruleValue){
        int count = 0;
        for(String[] item:items){
            if(isMatching(item,ruleKey,ruleValue)) count++;
        }
        return count;
    }

    public static boolean isMatching(String[] item,String ruleKey, String ruleValue){

        if(ruleKey.equals("type")){
            return ruleValue.equals(item[0]);
        } else if (ruleKey.equals("color")) {
            return ruleValue.equals(item[1]);
        } else if(ruleKey.equals("name")){
            return ruleValue.equals(item[2]);
        }

        return false;
    }

    public static void main(String[] args) {

        String[] a = {"phone", "blue", "pixel"};
        String[] b = {"computer", "silver" ,"lenovo"};
        String[] c = {"phone", "gold"," iphone"};
        List<String[]> items = List.of(a,b,c );
        System.out.println(MatchingCount.countMatching(3,items,"color","silver"));
    }

}
