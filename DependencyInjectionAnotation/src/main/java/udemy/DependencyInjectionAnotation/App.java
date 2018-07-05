package udemy.DependencyInjectionAnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach randomCoach = context.getBean("randomCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(randomCoach.getDailyWorkout());
		context.close();
	}
}
