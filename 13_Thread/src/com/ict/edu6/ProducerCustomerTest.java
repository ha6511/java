package com.ict.edu6;

public class ProducerCustomerTest {

	public static void main(String[] args) {
		
		Car car = new Car();

		//	생산자
		Producer	produce		=	new Producer(car);

		//	소비자 
		Customer	customer	=	new Customer(car);
		
		new Thread(customer).start();
		new Thread(produce).start();

	}
}
