package udemy.DependencyInjectionJava;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	public TennisCoach() {
	}

	@PostConstruct
	public void startup() {
		System.out.println("Starting");
	}

	@PreDestroy
	public void onDestroy() {
		System.out.println("Destroying");
	}

	public String getDailyWorkout() {
		return "Practice Tennis";
	}

}
