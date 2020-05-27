package com.ict.edu10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Vo implements Externalizable {
	
	private String name ;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;
	
	public Vo() {}
	
	
	
	public Vo(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.sum	=	kor + eng + math;
		
		this.avg	=	(int) (sum/3.0 * 10) / 10.0;
		
		if	(avg >= 90) hak = "A";
		else if	(avg >= 80 ) hak = "B";
		else if	(avg >= 70 ) hak = "C";
		else hak = "F";
	}



	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name	=	(String) in.readObject();
		sum		=	(int) in.readObject();
		avg		=	(double) in.readObject();
		hak		=	(String) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeObject(sum);
		out.writeObject(avg);
		out.writeObject(hak);
		
	}

	
}
