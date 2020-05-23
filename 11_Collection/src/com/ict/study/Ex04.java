package com.ict.study;

public class Ex04 {

	private	String	name;
	private	int		tot;
	private	double	avg;
	private	String	hak;
	private	int		rank = 1;
	
	
	public Ex04() {}


	public Ex04(String name, int tot, double avg, String hak, int rank) {
		this.name = name;
		this.tot = tot;
		this.avg = avg;
		this.hak = hak;
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTot() {
		return tot;
	}


	public void setTot(int tot) {
		this.tot = tot;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public String getHak() {
		return hak;
	}


	public void setHak(String hak) {
		this.hak = hak;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
