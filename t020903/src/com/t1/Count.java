package com.t1;

public class Count {
	public static final double PI = 3.14;

	public double getDimianji(double r) {
		double mj = r * r * PI;
		return mj;
	}

	public double getTiji(double r, double h) {
		double mjs = getDimianji(r);
		double tj=mjs*h;
		return tj;
	}
}
