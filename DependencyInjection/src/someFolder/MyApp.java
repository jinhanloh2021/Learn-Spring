package someFolder;

public class MyApp {
  public static void main(String[] args) {
    // create the object
    // Coach theCoach = new configurableCoach(); make this configurable.
    // Inversion of control
    Coach baseballCoach = new BaseballCoach();
    Coach trackCoach = new TrackCoach();
    // use the object
    System.out.println(baseballCoach.getDailyWorkout());
    System.out.println(trackCoach.getDailyWorkout());
  }
}
