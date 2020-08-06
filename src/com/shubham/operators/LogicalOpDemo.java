package com.shubham.operators;

class LogicalOpDemo {
    public static void main(String[] args) {

        // &&, ||, !

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 > 5 && num2 < 20);
        System.out.println(num1 > 5 || num2 < 20);
        System.out.println(!(num1 > 5 && num2 < 20));


        boolean t1 = true;
        boolean t2 = false;

        System.out.println(!t1);
        System.out.println(!t2);
    }
}