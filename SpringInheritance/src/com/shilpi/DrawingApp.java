package com.shilpi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext("Spring.xml");
		TrianglePoint trianglePointObj=(TrianglePoint)factory.getBean("triangle1");
		trianglePointObj.draw();
		
		TrianglePoint trianglePointObj1=(TrianglePoint)factory.getBean("triangle2");
		trianglePointObj1.draw();
		((AbstractApplicationContext) factory).registerShutdownHook();	
	}
}