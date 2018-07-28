package SpringPrototype.io.SpringPrototype;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {
	
	@Autowired
	private PrototypeBean myBean;
	
	public void showMessage() {
		System.out.println("Time is "+myBean.getDateTime());
	}

}
