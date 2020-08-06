package com.shubham.gettingstarted;// Program to demonstrate instance variable

class InstanceVarDemo {

	//instance variables
	
	int total_money = 0;
	int expenditure = 0;


	public static void main(String[] args){
	
		InstanceVarDemo jhon = new InstanceVarDemo(); //create a new object
		jhon.total_money = 100;
		jhon.expenditure = 20;

		System.out.println("Total Money (Jhon): " + jhon.total_money);
		System.out.println("Money Spent (Jhon): " + jhon.expenditure);

		InstanceVarDemo sam = new InstanceVarDemo();
		sam.total_money = 200;
		sam.expenditure = 30;

		System.out.println("Total Money (Sam): " + sam.total_money);
		System.out.println("Money Spent (Sam): " + sam.expenditure);
	}
}

/*
 * Instance variable is a container for storing values. In reality, it holds the address of the variable which is stored in memory
 *
 * Each object has it's own copy of instance variable. That means, if object 1 changes value of a variable, then it dosen't affect the value of same vairable in object 2
 *
 * In above example both john and sam had different amout of money.
 *
 * Every time a new object is created, a new copy of instance vairable is created and given to the particular object.
 * */
