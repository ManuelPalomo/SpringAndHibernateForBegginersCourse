package udemy.DependencyInjectionXML;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes in the batting practice";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void initialMethod() {
		System.out.println("Startup");
	}

	public void destroyMethod() {
		System.out.println("Destroy");
	}
}
