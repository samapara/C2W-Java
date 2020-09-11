package com.shubham.patterns;

/*

   Pattern 8:
    1
    1 2
    1 2 3
    1 2 3 4
 */
public class Pattern8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
