package com.shubham.commandlineargs;

class Program4 {

    public static void main(String[] args) {
        System.out.println(args[0] + args[1]); //10 20
        //It would output 1020, because + operator in string concats the 2 string
        //For addition we need to parse the String using wrapper classes.. we will see that in future
    }
}
