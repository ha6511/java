package com.ict.edu01;

interface I {
	public	void	play();
}

class	Bupper_Car implements I {
	@Override
	public void play() {
		System.out.println("범퍼카");
	}
}

class	Bassboll implements I {
	@Override
	public void play() {
		System.out.println("야구게임");
	}
}


class	K_land {
	
	void autoPlay(I i) {
		i.play();
	}
}


public class Ex09 {
	
	public static void main(String[] args) {
		
		K_land k_land = new K_land();
		//	인터페이스는 객체생성을 못한다.
//		I i = new I();
		k_land.autoPlay(new I() {
			public void play() {
				System.out.println("회전목마");
			}
		});

		System.out.println("===================");
		
		
		k_land.autoPlay(new Bupper_Car() );
		k_land.autoPlay(new Bassboll() );
		
		System.out.println("===================");
		
		
		int k = 1;
		
		I i = null;
		
		if (k==1) {
			i	=	new Bupper_Car();			
		} else if (k==2){
			i	=	new Bassboll();
		} 
	
		k_land.autoPlay(i);
		
		System.out.println("===================");

		
		
	}
}
