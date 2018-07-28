package SpringPrototype.io.SpringPrototype;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;

public class PrototypeBean {
	
	
	  private String dateTimeString = LocalDateTime.now().toString();

	    public String getDateTime() {
	        return dateTimeString;
	    }
}
