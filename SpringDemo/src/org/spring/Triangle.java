package org.spring;

public class Triangle {
	String type;
	int length;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
