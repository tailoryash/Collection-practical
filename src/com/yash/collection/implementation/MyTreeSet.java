package com.yash.collection.implementation;

import com.yash.collection.employee.Employee;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static TreeSet<Employee> addElement() {
        TreeSet<Employee> empTreeSet = new TreeSet<>(new MyComparator());
        empTreeSet.add(new Employee("Arpit Panchal", "Java"));
        empTreeSet.add(new Employee("Yash Fofdiya", "Java"));
        empTreeSet.add(new Employee("Harsh Patel", "ReactJS"));
        empTreeSet.add(new Employee("Parth Solanki", "PHP"));
        return empTreeSet;
    }

    public static void forEachLoop(TreeSet<Employee> emp) {
        for (Employee e : emp) {
            System.out.println(e);
        }
    }

    public static void iteratorLoop(TreeSet<Employee> emp) {
        Iterator<Employee> it = emp.iterator();
        while (true) {
            if (!it.hasNext()) break;
            System.out.println(it.next());
        }
    }
}

 class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String emp1 = o1.toString();
        String emp2 = o2.toString();
        return emp2.compareTo(emp1);
    }
}
