package com.ict.edu02;

// 	VO ( Value Object : 관계형 데이터 베이스에서 레코드(행)에 대응되는 자바 클래스 이다.
//						관계형 데이터 베이스의 컬럼명과 같은 이름의 변수를 만들어서 사용 
public class VO {

	private	 String idx, id, pw, name, age, reg;
	
	public VO() {
		// TODO Auto-generated constructor stub
	}

	public VO(String idx, String id, String pw, String name, String age, String reg) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.reg = reg;
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getpw() {
		return pw;
	}

	public void setpw(String pw) {
		this.pw = pw;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getage() {
		return age;
	}

	public void setage(String age) {
		this.age = age;
	}

	public String getreg() {
		return reg;
	}

	public void setreg(String reg) {
		this.reg = reg;
	}
	
	
}
