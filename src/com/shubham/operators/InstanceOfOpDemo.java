package com.shubham.operators;

public class InstanceOfOpDemo {

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo temp = null;

        System.out.println(d.x);

        System.out.println(d instanceof Demo);
        System.out.println(d instanceof Object);
        System.out.println(new Demo() instanceof Demo);
        System.out.println(temp instanceof Demo); //false
        //System.out.println(d.x instanceof int); //error

        System.out.println(new Demo2() instanceof Demo);
        System.out.println(new Demo2() instanceof Object);

    }
}

class Demo {
    int x = 10;
}

class Demo2 extends Demo {

}
