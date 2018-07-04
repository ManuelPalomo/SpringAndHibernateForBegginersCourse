package udemy.DependencyInjectionAnotation;

import org.springframework.stereotype.Component;

@Component
public class RandomCoach implements Coach {

	public String getDailyWorkout() {
		return "Do something";
	}

}
