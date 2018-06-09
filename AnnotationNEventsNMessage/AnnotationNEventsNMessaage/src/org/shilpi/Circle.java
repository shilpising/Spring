package org.shilpi;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
public class Circle implements Shape{
	
	Point center;
	
	public Point getCenter() {
		return center;
	}

	@Resource(name="centerPoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void show() {
			System.out.println("Inside Circle class");
			System.out.println("Coordicates: (" +center.getX() +")");
		}
	
	public void afterPropertiesSet() {
		System.out.println("Inside Circle class afterPropertySet");
	}
	public void destroy() {
		System.out.println("Inside Circle class destroy");
	}

}

