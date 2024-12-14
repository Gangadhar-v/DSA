package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        /*
        if it returns negative then order is s1,s2
        if it returns positive then order is s2,s1
        if it returns zero then both have same priority
         */
        return s2.length() - s1.length();   //descending order
    }
}
public class ComparatorExample {


    public static void comparatorExample() throws UnsupportedOperationException {
        List<String> list = Arrays.asList("ok", "bye");
        list.sort(new StringLengthComparator());
        //or it can be done through lambda expression
        list.sort((a,b )-> a.length() -  b.length()); //ascending order
        System.out.println(list);
    }

    public static void main(String args[]) {
        try {
            comparatorExample();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
