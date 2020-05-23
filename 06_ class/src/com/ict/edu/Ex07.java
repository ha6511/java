// 2020-05-14

package com.ict.edu;

public class Ex07 {

	private	String	name	= 	"커피우유";
	private	int		su		=	100;
	private	int		price	=	1100;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//	전역변수 와 지역변수 이름이 같을때
		//	전역변수에 this를 붙인다.
		//	이유은 전역벼와 지역변수의 이름이 같으면 
		//	무조건 우선순위는 지역변수이므로 지역변수만 사용한다.
		//	지역변수는 해당 메소드를 호출할때 생성됨.
		this. name = name;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
