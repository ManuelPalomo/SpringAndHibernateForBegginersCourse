package udemy.DependencyInjectionAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortune;

	public TennisCoach() {
	}

	public String getDailyWorkout() {
		return "Practice Tennis";
	}

	public String getDailyFortune() {
		return fortune.getFortune();
	}

	public FortuneService getFortune() {
		return fortune;
	}

	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}

}
