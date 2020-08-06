package com.shubham.gettingstarted;// Program for instance method

class InstanceMethodDemo {

	String name = "";
	int total_money = 0;
	int expenditure = 0;

	// Instance method
	void display() {

		System.out.println("Total Money ("+ name +"):" + total_money);
		System.out.println("Money Spent ("+ name +"):" + expenditure);

	}

	public static void main(String[] args){
	
		InstanceMethodDemo jhon = new InstanceMethodDemo();
		jhon.name = "jhon";
		jhon.total_money = 100;
		jhon.expenditure = 20;
		jhon.display();

		
		InstanceMethodDemo sam = new InstanceMethodDemo();
		sam.name = "sam";
		sam.total_money = 200;
		sam.expenditure = 30;
		sam.display();

	}
}

/*
 * In Java, a function is called as method. A method comprises of set of instruction to be executed. 
 *
 * Similar to variables, each object has it's own copy of the method. A object can call a method using dot(.) operator, similar to variable;
 *
 * A method can return some value or nothing (void). A single method can be called as many times the user want.
 * */
