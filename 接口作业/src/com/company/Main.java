package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            UseCompute useCompute = new UseCompute();
            Scanner scr = new Scanner(System.in);
            System.out.println("Please input:");
            double a = scr.nextDouble();
            char c = scr.next().toCharArray()[0];
            double b = scr.nextDouble();
            switch (c) {
                case '+':
                    useCompute.usecom(new Plus(), a, b);
                    break;
                case '-':
                    useCompute.usecom(new Minus(), a, b);
                    break;
                case '/':
                    useCompute.usecom(new Divide(), a, b);
                    break;
                case '*':
                    useCompute.usecom(new Multiply(), a, b);
                    break;
            }
        }
    }
}

