package Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Comparator is a interface used to implement custom sorting
it allows sorting based on different properties
methods in Comparator
1.compare
2.comparing    .reversed for descending order
3.thenComparing

Collections.sort() -> it takes Comparator is parameter

Comparator can be defined outside the class
 */

class Student{

    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Student name is "+ name + "student age is "+ age;
    }
}
public class CompareMethod {

    public static void main(String args[]){
        Student b = new Student("b",3);
        Student a = new Student("a",2);
        Student d = new Student("d",5);
        Student c = new Student("a",4);
        Student e = new Student("e",6);

        List<Student> students = new ArrayList<>();
        students.add(b);
        students.add(a);
        students.add(d);
        students.add(c);
        students.add(e);

        //Custom comparator using comparing method in Comparator interface for sorting based on multiple properties
        students.sort(Comparator.comparing(Student::getName).reversed().thenComparing(Student::getAge));
        System.out.println(students);


        //using lambda expression
        students.sort((s1,s2)->s2.getName().compareTo(s1.getName()));


        List<String> names = students.stream()
                .map(student -> student.name)
                .collect(Collectors.toList());

        //sorting based on length of string using lambda expression
        names.sort((first,second)->second.length() - first.length());
    }

}
