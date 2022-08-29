package someFolder;

public class BaseballCoach implements Coach {
  // define a private field for fortune service
  private FortuneService fortuneService;

  // define no args constructor
  public BaseballCoach() {
  };

  // define a constructor for dependency injection
  public BaseballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice.";
  }

  @Override
  public String getDailyFortune() {
    // use fortuneService to get daily fortune
    return fortuneService.getFortune(); // making use of dependency
  }
}
