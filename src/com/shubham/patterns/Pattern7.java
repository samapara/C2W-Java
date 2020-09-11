package com.shubham.patterns;
/*
Pattern 6:
    1
    2 3
    4 5 6
    7 8 9 10
*/
public class Pattern7 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j <= i){
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }
}
