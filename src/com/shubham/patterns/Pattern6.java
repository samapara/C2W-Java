package com.shubham.patterns;

/*
Pattern 6:
    *
    * *
    * * *
    * * * *


 */
public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j <= i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
