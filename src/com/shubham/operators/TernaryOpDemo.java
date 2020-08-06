package com.shubham.operators;

public class TernaryOpDemo {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        String result = x > y ? "X is greater" : "Y is greater";
        System.out.println(result);

        x = 5;
        y = 5;
        int result2 = ++x > y++ ? x++ : y++;

        System.out.println(result2);
        System.out.println(x);
        System.out.println(y);
    }
}
