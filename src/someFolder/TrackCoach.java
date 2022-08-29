package someFolder;

public class TrackCoach implements Coach {
  // define a private field for fortune service
  private FortuneService fortuneService;

  // define no args constructor
  public TrackCoach() {
  };

  // define a constructor for dependency injection
  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run 20 laps.";
  }

  @Override
  public String getDailyFortune() {
    return "Track coach says: " + fortuneService.getFortune(); // making use of dependency
  }
}
