package com.ict.edu;

public class Ex04 {

	private	String	name;
	private	int		tot;
	private	double	avg;
	private	String	hak;
	private	int		rank;
	
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
	
	public void s_Sum(int kor, int eng, int math) {
		this.tot = kor + eng + math;
		s_Avg();
	}
	
	public void s_Avg()	{
		this.avg = (int)( ( tot / 3.0 ) * 10) / 10;
		s_hak();
	}
	public void s_hak() {
		if (avg>=90) {
			hak = "A";
		} else if (avg>=80) {
			hak = "B";
		} else if (avg>=70) {
			hak = "C";
		} else {
			hak = "F";
		} 
		setRank(1);
	}	
	
}
