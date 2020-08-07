package com.shubham.loops;

public class WhileDemo4 {

    //break keyword

    public static void main(String[] args) {

        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0 && i % 10 == 0) {
                break;
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
