package org.shilpi;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;


public class Triangle implements Shape{
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Triangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void show() {
			System.out.println("Inside Trianle class");
			System.out.println("Coordicates: (" +getX() +","+getY()+")");
		}

	public void init() {
		System.out.println("Inside init method");
	}
	public void cleanUp() {
		System.out.println("Inside cleanUp method");
	}
	
	public void afterPropertiesSet() {
		System.out.println("Inside Trianle class afterPropertySet");
	}
	public void destroy() {
		System.out.println("Inside Trianle class destroy");
	}
}
