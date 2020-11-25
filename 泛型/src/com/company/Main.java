package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList person = new ArrayList(3);
        try {
            System.out.println("请输入姓名");
            person.add(scr.nextLine());
            System.out.println("请输入年龄和地区");
            person.add(scr.nextInt());
            person.add(scr.nextLine());
            System.out.println("信息改变前:" + person);
            person.set(0, scr.nextLine());
            System.out.println("信息改变后:" + person);
        } catch (Exception e) {
            System.out.println("输入类型错误");
        }
    }
}

