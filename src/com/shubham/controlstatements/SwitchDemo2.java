package com.shubham.controlstatements;

public class SwitchDemo2 {

    public static void main(String[] args) {
        char c = 'a';

        /* boolean isTrue = true;

        switch (isTrue){
            case true:
                System.out.println("true");
                break;
             case false:
                System.out.println("false");
                break;

        }*/
        switch (c) {
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;

            default:
                System.out.println("Other character");
        }
    }
}
