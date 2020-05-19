package com.ict.edu3;

public class Student extends Person{
	
	private	int	id;

	/*
	public Student() {
		//	super()	:				//	super()가 숨어 있기 때문에 오류 이다.
		//	super("태권브이", 24) ; //	이렇게 한 경우 오류가 아님.
		//	Person 클래스에 기본생성자를 만들어도 오류가 아님 
	}
	*/
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print()	{
		super.print();
		System.out.println(", ID : "+ id);
	}
}
