package com.ict.study;

public class ProducerCustomerTest {

	public static void main(String[] args) {
		
		Car	car	=	new Car();
		
		Customer	customer	=	new	Customer(car);
		Thread		tCustomer	=	new	Thread	(customer);
		
		Producer	producer	=	new	Producer(car);
		Thread		tProducer	=	new Thread	(producer);
		
		tCustomer.start();
		
		tProducer.start();
		
	}
	
	
	
	
	
	
	
}
