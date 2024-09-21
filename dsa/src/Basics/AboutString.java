package Basics;


import java.util.Arrays;

/*
ASCII -> American Standard Code for information interchange
a->97
0->48
1->49

 */
public class AboutString {

    public static void main(String args[]){

        //compareTo()
        String apple = "apple";
        String banana = "banana";

        System.out.println(apple.compareTo(banana));  // ASCII value of 'a' is 97 , ASCII value of 'b' 98
        // 'a' is one less than 'b'    -> 97-98=-1
        System.out.println(banana.compareTo(apple));   //98 - 97 = 1

        String gangadhar = "gangadhar";
        String ganga = "ganga";
        System.out.println(ganga.compareTo(gangadhar));  //ganga has 4 less character than gangadhar
        System.out.println(gangadhar.compareTo(ganga));  //gangadhar has 4 more character than ganga

        //substring(int s,int e) s is inclusive and e is exclusive
        String shankara = "shankara";
        System.out.println(shankara.substring(0,6));

        //split()
        String a[] = shankara.split("a");
        System.out.println(Arrays.toString(a));

        //replace
        System.out.println(shankara.replace("a","A"));

        //charAt(int index)
        shankara.charAt(0);

        //trim()  -> removes whiteSpaces in start and end
        String b = "  Namaskaaram ";
        System.out.println(b.trim());

        //join
        System.out.println(b.join(shankara));
        String joined = String.join(",","a","b","c"); // "a,b,c"

        //prefix
        shankara.startsWith("shan");  //true

        //suffix

        shankara.endsWith("nkara");

        //matches
        String str = "abc123";
        boolean matches = str.matches("[a-z]+\\d+");  // matches = true


    }

      /*
      IMPORTANT METHODS
      String Manipulation -> replace(), substring(), split()
      String Comparison  -> equals(), equalsIgnoreCase(),contains(),matches()
      Accessing Data     -> charAt(), indexOf(), lastIndexOf()
      Formatting         -> toLowerCase(), toUpperCase(), trim(), join()
       */
}
