package com.shubham.loops;

public class ForDemo2 {

    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0 && i % 5 == 0)
                System.out.println(i);
        }
    }
}