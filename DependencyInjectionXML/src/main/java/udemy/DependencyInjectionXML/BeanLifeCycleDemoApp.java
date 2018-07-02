package udemy.DependencyInjectionXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanLifeCycleApplicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		context.close();

	}
}
