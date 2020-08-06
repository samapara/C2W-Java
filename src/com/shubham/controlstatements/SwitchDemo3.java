package com.shubham.controlstatements;

public class SwitchDemo3 {

    // Allowed data types for switch are Byte, Char, String, Int
    public static void main(String[] args) {

        int floor = 1;
        char shop = 'c';
        char gaming = 'D';

        switch (floor) {
            case 1:
                switch (shop) {
                    case 'A':
                        System.out.println("1st Floor 1st Shop");
                        break;
                    case 'B':
                        System.out.println("1st Floor 2nd Shop");
                    case 99:
                        System.out.println("1st Floor 3rd Shop");
                        break;
                    default:
                        System.out.println("No Such Shop Found on 1st Floor");
                        break;
                }
                break;

            case 2:
                switch (gaming) {
                    case 'A':
                        System.out.println("2nd Floor 1st Shop");
                        break;
                    case 'B':
                        System.out.println("2nd Floor 2nd Shop");
                        break;
                    case 'C':
                        System.out.println("2nd Floor 3rd Shop");
                        break;
                    default:
                        System.out.println("No Such Shop Found on 2nd Floor");
                        break;
                }
                break;
            default:
                System.out.println("No Floor Found");
                break;
        }
    }
}
