package com.shubham.patterns;
/*
Pattern 2:
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16

 */
public class Pattern2 {
    public static void main(String[] args) {
        int count = 1;
       for(int i = 0; i < 4; i++ ){
           for(int j = 0; j < 4; j++){
               System.out.print(count + " ");
               count++;
           }
           System.out.println();
       }
    }
}
