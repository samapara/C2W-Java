package com.shubham.patterns;

/*
Pattern 3:
    7 7 7 7
    7 7 7 7
    7 7 7 7
    7 7 7 7

 */
public class Pattern3 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("7 ");
            }
            System.out.println();
        }
    }
}
