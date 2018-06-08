package org.shilpi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class COISpringMain {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("Spring.xml");
		((AbstractApplicationContext)appContext).registerShutdownHook();
		Shape obj=(Triangle)appContext.getBean("triangle");
		Shape obj1=(Circle)appContext.getBean("circle");
		obj.show();
		obj1.show();

	}

}
