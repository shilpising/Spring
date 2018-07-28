package SpringPrototype.io.SpringPrototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Spring - Injecting a Prototype Bean into a Singleton Bean Problem
@Configuration
public class App 
{
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}
	
	@Bean
	public SingletonBean singletonBean() {
		return new SingletonBean();
	}
    public static void main( String[] args ) throws InterruptedException
    {
    	 AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(App.class);
    	 SingletonBean bean = context.getBean(SingletonBean.class);
         bean.showMessage();
         Thread.sleep(1000);

         bean = context.getBean(SingletonBean.class);
         bean.showMessage();
    }
}
