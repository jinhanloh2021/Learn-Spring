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

  // add initialisation method
  public void trackCoachInitialiser() {
    System.out.println("Track Coach: Initialiser");
  }

  // add destructor method
  public void trackCoachDestructor() {
    System.out.println("Track Coach: Destructor");
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
