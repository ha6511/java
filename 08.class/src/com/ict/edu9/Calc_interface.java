//	2020-05-19

package com.ict.edu9;

public class Calc_interface implements Add, Sub, Oper {

	@Override
	public double plus(double s1, double s2) {
		return (s1 + s2);
	}
	
	@Override
	public double minus(double s1, double s2) {
		return s1 - s2;
	}
	
	@Override
	public double div(double s1, double s2) {
		return s1 / s2;
	}
	
	@Override
	public double mul(double s1, double s2) {
		return s1 * s2;
	}
}
