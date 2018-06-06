package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangleObj=(Triangle)factory.getBean("triangle");
		triangleObj.draw();
		
		TriangleConstructor triangleObj1=(TriangleConstructor)factory.getBean("triangleConstructor");
		triangleObj1.draw();
		TrianglePoint trianglePointObj=(TrianglePoint)factory.getBean("trianglePoint");
		trianglePointObj.draw();
		
		
		TriangleCollection triangleCollObj=(TriangleCollection)factory.getBean("triangleCollection");
		triangleCollObj.draw();
		((AbstractApplicationContext) factory).registerShutdownHook();	
	}
}