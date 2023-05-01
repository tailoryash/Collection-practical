package com.yash.collection.implementation;

import com.yash.collection.employee.Employee;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
    public static HashSet<Employee> addElement() {
        HashSet<Employee> empHashSet = new HashSet<>();
        empHashSet.add(new Employee("Arpit Panchal", "Java"));
        empHashSet.add(new Employee("Yash Fofdiya", "Java"));
        empHashSet.add(new Employee("Harsh Patel", "ReactJS"));
        empHashSet.add(new Employee("Parth Solanki", "PHP"));
        return empHashSet;
    }

    public static void forEachLoop(HashSet<Employee> emp) {
        for (Employee e : emp) {
            System.out.println(e);
        }
    }

    public static void iteratorLoop(HashSet<Employee> emp) {
        Iterator<Employee> it = emp.iterator();
        while (true) {
            if (!it.hasNext()) break;
            System.out.println(it.next());
        }
    }
}
