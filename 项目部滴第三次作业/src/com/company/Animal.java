package com.company;

class Animal {
    private String name;
    private char sex;
    private int age;

    void eat(){
        System.out.println("动物要吃饭");
    }

    void sleep(){
        System.out.println("动物会睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
