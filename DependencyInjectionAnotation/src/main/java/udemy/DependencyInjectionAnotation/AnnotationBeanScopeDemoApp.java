package udemy.DependencyInjectionAnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach secondCoach = context.getBean("tennisCoach", Coach.class);

		boolean result = (coach == secondCoach);
		System.out.println(result);

		context.close();
	}
}
