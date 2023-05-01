package com.yash.collection.employee;

public class Employee {
     private String empName;
     private String stack;

    public Employee(String empName, String stack) {
        this.empName = empName;
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", stack='" + stack + '\'' +
                '}';
    }
}
