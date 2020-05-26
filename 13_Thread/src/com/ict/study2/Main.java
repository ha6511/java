package com.ict.study2;

public class Main {
	
	public static void main(String[] args) {
		
		Car	car	=	new Car();
		
		Customer	customer 	= 	new Customer(car);
		Thread		tCustomer	=	new	Thread(customer);

		Produce		produce		=	new Produce(car);
		Thread		tProduce	=	new	Thread(produce);
		
		tCustomer.start();
		tProduce.start();
		
	}

}
