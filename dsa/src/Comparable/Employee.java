package Comparable;

/*
Comparable is used for natural ordering
it always defined inside the class

 */

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{

    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getSalary(){
        return salary;
    }

     @Override
     public int compareTo(@NotNull Employee object) {

        //Primary sorting :by name
         int nameComparison = this.name.compareTo(object.name);

         if(nameComparison != 0){
             return nameComparison;
         }

         return Integer.compare(this.salary,object.salary); //ascending order sorting based on salary
         //return Integer.compare(object.salary, this.salary) -> for descending order based on salary
     }

     public static void main(String args[]){

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("veer savarkar",10010));
        employeeList.add(new Employee("narayan savarkar",100010));
        employeeList.add(new Employee("dhamodar",30010));
        employeeList.add(new Employee("somnath",90010));
        employeeList.add(new Employee("raj guru",40010));
        employeeList.add(new Employee("suk dev",30010));

         Collections.sort(employeeList);
     }
 }
