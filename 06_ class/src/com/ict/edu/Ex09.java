// 2020-05-14

package com.ict.edu;

public class Ex09 {

	private	String	name;
	private	int		sum;
	private	double	avg;
	private	String	hak;
	private	int		rank = 1;
	
	//	합계구하기
	public	void	s_sum(int kor, int eng, int math)	{
		this.sum	= kor + eng + math;
		s_avg();
	}
	
	//	평균구하기
	public	void	s_avg()	{
		this.avg	=	(int)( (sum / 3.0) * 10 ) / 10.0;
		s_hak();
	}
	
	//	학점구하기
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
	}

	// getter / setter

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
	
	public int addRank()	{
		this.rank += 1;
		return this.rank;
	}
	
}
