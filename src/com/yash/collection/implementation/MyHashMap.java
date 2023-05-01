package com.yash.collection.implementation;

import com.yash.collection.employee.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {
    public static HashMap<Integer, Employee> addElement() {
        HashMap<Integer, Employee> empHashMap = new HashMap<>();
        empHashMap.put(104, new Employee("Yash Tailor", "Java"));
        empHashMap.put(103, new Employee("Hardeek Bhatia", "Java"));
        empHashMap.put(110, new Employee("Arpit Panchal", "DevOps"));
        return empHashMap;
    }

    public static void forEachLoop(HashMap<Integer, Employee> empHashMap) {
        for (Map.Entry<Integer, Employee> emp : empHashMap.entrySet()) {
            System.out.println("Id: " + emp.getKey() + ", " + emp.getValue());
        }
    }
    public static void iteratorLoop(HashMap<Integer, Employee> empHashMap) {
        Iterator it = empHashMap.entrySet().iterator();
        while(true){
            if(!it.hasNext()) break;
            Map.Entry<Integer, Employee> empEntry = (Map.Entry) it.next();
            System.out.println("Id: " + empEntry.getKey() + ", " + empEntry.getValue());
        }
    }
}
