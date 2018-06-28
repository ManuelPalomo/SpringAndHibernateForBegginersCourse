package udemy.DependencyInjectionXML;

public class MyApp {
	public static void main(String[] Args) {
		Coach coach = new BaseballCoach();
		System.out.println(BaseballCoach.class.getName());
		System.out.println(coach.getDailyWorkout());

	}
}
