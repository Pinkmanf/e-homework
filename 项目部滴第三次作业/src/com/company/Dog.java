package com.company;

class Dog extends Animal{
    @Override
    void sleep() {
        super.sleep();
    }
    int run(int a){
        System.out.println("小狗要跑步1");
        return a;
    }
    char run(char c){
        System.out.println("小狗要跑步2");
        return c;
    }
}
