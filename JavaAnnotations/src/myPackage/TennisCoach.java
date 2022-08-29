package myPackage;

// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("MyTennisCoach") // Spring automatically registers this bean. Uses the id "MyTennisCoach"
// @Scope("prototype") // State the scope of this class using the @Scope annotation
@Component // Spring default bean id "tennisCoach"
public class TennisCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "I am using spring annotations. Practice forehand smash.";
  }
}
