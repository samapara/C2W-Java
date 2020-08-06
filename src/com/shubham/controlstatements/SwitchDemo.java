package com.shubham.controlstatements;

public class SwitchDemo {

    public static void main(String[] args) {
        int floor = 10;

        switch (floor) {
            case 0:
                System.out.println("Basement");
                break;
            case 1:
                System.out.println("First Floor");
                break;
            case 2:
                System.out.println("Second Floor");
                break;
            case 3:
                System.out.println("Terrace");
                break;
            default:
                System.out.println("Floor not found");
        }
    }


}
