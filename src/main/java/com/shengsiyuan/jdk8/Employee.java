package com.shengsiyuan.jdk8;


public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("name = " + name);
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
