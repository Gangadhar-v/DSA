package problems.Leetcode;
/*
Problem Statement
return the number of distinct dit position in the binary form of the number
 */
public class HammingDistance {

    public static int hammingDistance(int a, int b){

        String i = Integer.toBinaryString(a);
        String j = Integer.toBinaryString(b);

        int maxLength = Integer.max(i.length(),j.length());


        i = String.format("%"+maxLength+"s",i).replace(' ','0');
        j = String.format("%"+maxLength+"s",j).replace(' ','0');
        int count = 0;
       for(int g = 0;g<maxLength;g++){
           if(i.charAt(g) != j.charAt(g)){
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {


        System.out.println( hammingDistance(1,4));
    }
}
