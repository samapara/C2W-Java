package com.shubham.loops;

public class WhileDemo {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }

        // while(i <= 20);  -> this would cause infinite loop
    }
}
