package com.company;

final class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("小猫也要吃饭");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}
