package com.ict.edu6;

public class Teacher extends Person{
	private	String	subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// 부모가 완성하지 못한 것을 자식이 완성한다.
	@Override
	public void print() {
		System.out.println("이름 : " + super.getName() + ",  나이 : " + super.getAge() + ", 과목 : "+ subject);		
	}
//	public void print()	{
//		super.print();
//		System.out.println(", 과목 : "+ subject);
//	}
}
