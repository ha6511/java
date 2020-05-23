package com.ict.edu;

public class Person {

    private String name ;
    private int sum ;
    private double avg ;
    private String hak ;
    private int rank = 1 ;
    
    public Person() {}

	public Person(String name, int sum, double avg, String hak, int rank) {
		super();
		this.name = name;
		this.sum = sum;
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

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
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
