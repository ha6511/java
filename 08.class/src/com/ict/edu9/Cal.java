package com.ict.edu9;

public class Cal implements Add, Sub, Mul, Div{

	@Override
	public double plus(double s1, double s2) {
		return s1 + s2;
	}

	@Override
	public double minus(double s1, double s2) {
		return s1 - s2;
	}

	@Override
	public double mul(double s1, double s2) {
		return s1 * s2;
	}

	@Override
	public double div(double s1, double s2) {
		return s1 / s2;
	}


}
