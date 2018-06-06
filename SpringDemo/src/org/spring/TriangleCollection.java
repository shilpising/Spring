package org.spring;

import java.util.List;

public class TriangleCollection {
	
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for(Point point : points) {
			System.out.println("points ("+point.getX()+","+point.getY()+")");
		}
	}

}
