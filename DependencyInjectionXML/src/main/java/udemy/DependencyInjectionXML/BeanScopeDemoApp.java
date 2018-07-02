package udemy.DependencyInjectionXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		Coach coach = context.getBean("myCoach",Coach.class);
		Coach secondCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (coach == secondCoach);
		System.out.println(result);
		
		context.close();
		
	}
}
