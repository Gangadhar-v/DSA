package problems;


import java.util.Arrays;

public class CheckAnagram {

    static Boolean checkAnagram(String str1, String str2) {
        char[] array1 = str1.toCharArray();

        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }

    static Boolean checkAnagram2(String s, String t){
        int [] array1 = new int[26];
        int [] array2 = new int[26];

        for( int i =0;i<=s.length() -1 ; i++){
            int index1 =  s.charAt(i) - 'a';
            int index2 = t.charAt(i) - 'a';
            array1[index1] ++;
            array2[index2]++;
        }


        return Arrays.equals(array1,array2);
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";
        System.out.println(CheckAnagram.checkAnagram(str1,str2));
        System.out.println(CheckAnagram.checkAnagram2(str1,str2));
    }
}

