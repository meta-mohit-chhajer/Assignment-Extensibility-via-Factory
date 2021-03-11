package com.metacube.FactoryMethod;

public class Point {
	   // x-axis point
		private double x;
		
		// y-axis point
		private double y;
		
		public Point (double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double getX() {
			return this.x;
		}
		
		public double getY() {
			return this.y;
		}
}
