package com.edu.study;

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
class K_land {
	
	void autoPlay(I i) {
		i.play();
	}
}

public class Ex09 {
	public static void main(String[] args) {
		
		K_land k_land = new K_land();
		
		k_land.autoPlay(new I() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
		});
				
        System.out.println("===================");

        k_land.autoPlay(new Bupper_Car());
        k_land.autoPlay(new Bassboll());
        
        System.out.println("==============");
        
        int k = 1;
        
        I i = null;
        
        
	}
	
}
