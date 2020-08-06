package com.shubham.controlstatements;

public class IfElseLadder {
    public static void main(String[] args) {

        int floor = 3;

        if (floor == 0) {
            System.out.println("Basement");
        } else if (floor == 1) {
            System.out.println("First Floor");
        } else if (floor == 2) {
            System.out.println("Second Floor");
        } else if (floor == 3) {
            System.out.println("Terrace");
        } else {
            System.out.println("Floor not found");
        }

        System.out.println("Outside If Else Ladder");
    }
}
