package problems.Leetcode;

import java.util.Arrays;

/*
PROBLEM STATEMENT
Every valid email consists of a local name and a domain name, separated by the '@' sign

If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com"

Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.

 */
public class UniqueEmail {

    public static void main(String args[]){

        String name = "Gangadhar v";

//        System.out.println(name.substring(0,4));  //begin index is inclusive and end index is exclusive
//        System.out.println(name.compareTo("Gangadhar"));
//        System.out.println(name.concat("Tilak"));
//        System.out.println(name.contains(""));
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(name.split("a")));
        String apple = "apple";
        String banana = "banana";
        System.out.println(apple.compareTo(banana));


    }
}
