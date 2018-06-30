package udemy.SpringCourse;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in the batting practice";
	}
}
