package com.yash.collection;

import com.yash.collection.employee.Employee;
import com.yash.collection.implementation.*;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Statement - 1 : Create array list and iterate through loop.
         */
        ArrayList<Employee> empArrayListExample = MyArrayList.addElement();
        System.out.println("-------------- ArrayList: Iterate through For Each Loop --------------");
        MyArrayList.forEachLoop(empArrayListExample);
        System.out.println("-------------- ArrayList: Iterate through Iterator --------------");
        MyArrayList.iteratorLoop(empArrayListExample);
        System.out.println("-------------- ArrayList: Iterate through ListIterator --------------");
        MyArrayList.listIteratorLoop(empArrayListExample);

        /*
        Statement - 2 : Create hash set and iterate through loop.
         */
        HashSet<Employee> employeeHashSet = MyHashSet.addElement();
        System.out.println("-------------- HashSet: Iterate through For Each Loop --------------");
        MyHashSet.forEachLoop(employeeHashSet);
        System.out.println("-------------- HashSet: Iterate through Iterator --------------");
        MyHashSet.iteratorLoop(employeeHashSet);

        /*
        Statement - 3 : Create hash map and iterate through loop.
         */
        HashMap<Integer, Employee> empHashMap = MyHashMap.addElement();
        System.out.println("-------------- HashMap: Iterate through For Each Loop --------------");
        MyHashMap.forEachLoop(empHashMap);
        System.out.println("-------------- HashMap: Iterate through Iterator --------------");
        MyHashMap.iteratorLoop(empHashMap);

        /*
        Statement - 4 : Create tree set and iterate through loop.
         */
        TreeSet<Employee> employeeTreeSet = MyTreeSet.addElement();
        System.out.println("-------------- TreeSet: Iterate through For Each Loop --------------");
        MyTreeSet.forEachLoop(employeeTreeSet);
        System.out.println("-------------- TreeSet: Iterate through Iterator --------------");
        MyTreeSet.iteratorLoop(employeeTreeSet);

        /*
        Statement - 5 : Create tree map and iterate through loop.
         */
        TreeMap<Integer, Employee> empTreeMap = MyTreeMap.addElement();
        System.out.println("-------------- TreeMap: Iterate through For Each Loop --------------");
        MyTreeMap.forEachLoop(empTreeMap);
        System.out.println("-------------- TreeMap: Iterate through Iterator --------------");
        MyTreeMap.iteratorLoop(empTreeMap);
    }
}