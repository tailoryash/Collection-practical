package com.yash.collection.implementation;

import com.yash.collection.employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {
    public static ArrayList<Employee> addElement(){
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Yash Tailor", "Java"));
        empList.add(new Employee("Hardeek Bhatia", "Java"));
        empList.add(new Employee("Bhavin Patel", ".NET"));
        empList.add(new Employee("Dhruv Patel", "MEAN"));
        return empList;
    }

    public static void forEachLoop(ArrayList<Employee> emp){
        for (Employee e:
             emp) {
            System.out.println(e);
        }
    }

    public static void iteratorLoop(ArrayList<Employee> emp){
        Iterator<Employee> it = emp.iterator();
        while(true){
            if (!it.hasNext()) break;
            System.out.println(it.next());
        }
    }

    public static void listIteratorLoop(ArrayList<Employee> emp){
        ListIterator<Employee> it = emp.listIterator();
        while(true){
            if (!it.hasNext()) break;
            System.out.println(it.next());
        }
    }
}
