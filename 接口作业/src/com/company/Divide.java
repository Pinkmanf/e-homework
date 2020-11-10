package com.company;

public class Divide implements Compute {

    @Override
    public double compute(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("除数不能为0！");
            return 0;
        }
    }
}
