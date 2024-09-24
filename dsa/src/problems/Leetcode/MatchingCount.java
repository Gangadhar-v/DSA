package problems.Leetcode;


import java.util.List;

/*
PROBLEM STATEMENT
You are given a list of items, where each item is represented by an array of three strings: [type, color, name]. The list contains N items in total. Additionally, you are given a rule specified by two strings, ruleKey and ruleValue.

An item matches the rule if one of the following conditions is true:

ruleKey == "type" and ruleValue is equal to the item's type.
ruleKey == "color" and ruleValue is equal to the item's color.
ruleKey == "name" and ruleValue is equal to the item's name.
Your task is to determine how many items in the list match the given rule.

Input Format
The first line contains a single integer, N, representing the number of items.

The next N lines each contain three space-separated strings: the type, color, and name of an item.

The following line contains the string ruleKey.

The last line contains the string ruleValue.

Output Format
Print the number of items that match the given rule.

3
phone blue pixel
computer silver lenovo
phone gold iphone
color
silver



 */
public class MatchingCount {

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
