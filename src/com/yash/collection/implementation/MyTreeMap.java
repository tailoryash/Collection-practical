package com.yash.collection.implementation;

import com.yash.collection.employee.Employee;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static TreeMap<Integer, Employee> addElement() {
        TreeMap<Integer, Employee> empTreeMap = new TreeMap<>(new MyComparator());
        empTreeMap.put(104, new Employee("Yash Tailor", "Java"));
        empTreeMap.put(103, new Employee("Hardeek Bhatia", "Java"));
        empTreeMap.put(110, new Employee("Arpit Panchal", "DevOps"));
        return empTreeMap;
    }

    public static void forEachLoop(TreeMap<Integer, Employee> empTreeMap) {
        for (Map.Entry<Integer, Employee> emp : empTreeMap.entrySet()) {
            System.out.println("Id: " + emp.getKey() + ", " + emp.getValue());
        }
    }
    public static void iteratorLoop(TreeMap<Integer, Employee> empTreeMap) {
        Iterator it = empTreeMap.entrySet().iterator();
        while(true){
            if(!it.hasNext()) break;
            Map.Entry<Integer, Employee> empEntry = (Map.Entry) it.next();
            System.out.println("Id: " + empEntry.getKey() + ", " + empEntry.getValue());
        }
    }
}
