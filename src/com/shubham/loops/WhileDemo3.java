package com.shubham.loops;

public class WhileDemo3 {

    public static void main(String[] args) {
        int num = 124;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of digits is : " + sum);
    }
}
