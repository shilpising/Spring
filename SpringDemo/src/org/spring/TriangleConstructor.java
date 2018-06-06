package org.spring;

public class TriangleConstructor {
	String type;
	int length;
	
	public TriangleConstructor(String type)
	{
		this.type=type;
	}
	
	public TriangleConstructor(String type, int length)
	{	
		this.type=type;
		this.length=length;
	}
	public String getType() {
		return type;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void draw() {
		System.out.println(getType()+"--"+(getLength()+10)+"  Triangle drawn");
	}
}
