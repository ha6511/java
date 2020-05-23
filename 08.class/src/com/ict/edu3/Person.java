package com.ict.edu3;

public class Person {

	private	String	name;
	private int		age;
	
	// <<create>>-Person(name: String, age: int)
	//	현재 멤버필드 전체를 인자로 사용
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public	void print()	{
		System.out.print("이름 : " + name + ",  나이 : " + age);
	}

}
