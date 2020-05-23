//	2020-05-15

package com.ict.edu;

public class Ex11 {
	//	생성자  : 클래스를 객체로 호출할때 자동으로 한번 호출한다.
	//		목적 : 멤버필드(변수와 상수)의 초기화 
	//		특징 : 
	//			-. 생성자이름은 클래스이름과 같다.
	//			-. 반환형이 없는 메소드와 같다.
	//			-. 생성자도 오버로딩이 가능
	//			   (한 클래스 안에 여러개의 생성자가 존재할 수 있다.)
	//			-. 생성자가 보이기 않으면 기본 생성자가 숨어 있는 것이다.
	//			-. 기본 생성자란 인자가 없는 생성자 이다. 즉 클래스이름();
	//			-. 만약에 클래스안에 생성자가 존재하면 기본생성자는 사라진다.
	//			   이때는 클래스안에 존재하는 생성자로 객체를 생성해야 한다.
	
	private	String	name	=	"일지매";
	private	int		age		=	24;
	private	String	add		=	"충청도";
	
	//	생성자 오버로딩 
	//	생성자 
	public Ex11() {
	}
	public Ex11(String name) {
		this.name = name;
	}
	public Ex11(String name, int age, String add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}

	//	getter / setter
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
}
