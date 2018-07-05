package udemy.DependencyInjectionAnotation;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	public String getFortune() {
		return "Yoksetioxdxd";
	}

}
