package SpringPrototype.io.SpringPrototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class SingletonBean {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	public void showMessage() {
		 PrototypeBean myBean=applicationContext.getBean(PrototypeBean.class);
		System.out.println("Time is "+myBean.getDateTime());
	}

}
