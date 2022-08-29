package someFolder;

public class CricketCoach implements Coach {
  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  // no args constructor
  public CricketCoach() {
    System.out.println("Cricket Coach: Inside no args constructor");
  }

  // setter dependency injection
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("Cricket Coach: Inside set fortune service setter method.");
    this.fortuneService = fortuneService;
  }

  public void setEmailAddress(String emailAddress) {
    System.out.println("Cricket Coach: Set email address.");
    this.emailAddress = emailAddress;
  }

  public void setTeam(String team) {
    System.out.println("Cricket Coach: Set team.");
    this.team = team;
  }

  // getter methods
  public String getEmailAddress() {
    return emailAddress;
  }

  public String getTeam() {
    return team;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
