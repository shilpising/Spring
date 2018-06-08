package com.shilpi;

public class TrianglePoint {
	Point zeropoint;
	Point pointA;
	Point pointB;
	
	public Point getZeropoint() {
		return zeropoint;
	}

	public void setZeropoint(Point zeropoint) {
		this.zeropoint = zeropoint;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw() {
		System.out.println("Triangle Point1 ("+zeropoint.getX()+","+zeropoint.getY()+")");
		System.out.println("Triangle Point2 ("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("Triangle Point3 ("+pointB.getX()+","+pointB.getY()+")");
	}

}
