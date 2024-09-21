package Basics;


import java.util.ArrayList;
import java.util.List;

/*
List is collection in java

Note -> List are always used with Wrapper class Integer, Character
List are Dynamic in size
MutableList -> ArrayList, LinkedList
ImmutableList -> List.of() , once it is created it cannot be changed
 */
public class ListImplementation {

    public static void main(String args[]){


        //MutableList
        List<String> mutableList = new ArrayList<>();

        mutableList.add("Ganga");
        mutableList.add("Eshwara");
        mutableList.set(1,"Venkateswara");

        //ImmutableList
        List<String> immurableList = List.of("Apple","Banana");
        System.out.println(immurableList.get(1));
        immurableList.add("Orange");  // Throws UnsupportedOperationException
    }
}
