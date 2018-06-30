package udemy.DependencyInjectionXML;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = { "Good", "Bad", "Meh" };

	public String getFortune() {
		Random random = new Random();
		int randomIndex = random.nextInt(fortunes.length - 1);
		return fortunes[randomIndex];
	}

}
