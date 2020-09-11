package com.shubham.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j <= i){
                    System.out.print(count*count + " ");
                    count++;
                }

            }
            System.out.println();
        }
    }
}
