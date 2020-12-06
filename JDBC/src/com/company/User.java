package com.company;

public class User {
    private int age;
    private String name;
    public String toString() {
        String str;
        str="{'age':"+age+","+"'name':'"+name+"'"+"}";
        return str;
    }

     int getAge() {
        return age;
    }

     void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }
}
