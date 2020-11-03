package com.company;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        char c='r';
        Animal mimi=new Cat();
        mimi.setName("喵喵");
        mimi.setAge(3);
        mimi.setSex('w');
        System.out.println("姓名:"+mimi.getName());
        System.out.println("年龄:"+mimi.getAge());
        System.out.println("性别:"+mimi.getSex());
        mimi.eat();
        mimi.sleep();
        System.out.println("-------------------------------");

        Dog husky=new Dog();
        husky.run(a);
        husky.run(c);
    }
}
