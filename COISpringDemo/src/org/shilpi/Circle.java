package org.shilpi;

public class Circle implements Shape{
	private int x;

	
	
	public int getX() {
		return x;
	}

	

	public Circle(int x) {
		super();
		this.x = x;
		
	}
	
	public void show() {
			System.out.println("Inside Circle class");
			System.out.println("Coordicates: (" +getX() +")");
		}
	
	public void afterPropertiesSet() {
		System.out.println("Inside Circle class afterPropertySet");
	}
	public void destroy() {
		System.out.println("Inside Circle class destroy");
	}

}

