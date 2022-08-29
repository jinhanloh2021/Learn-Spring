package someFolder;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//have to download spring-5.3.9-dist.zip before I can use this class.

public class HelloSpringApp {
  public static void main(String[] args) {
    // load the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from spring container. Code to an interface, not an
    // implementation
    Coach theCoach = context.getBean("myCoach", Coach.class);

    // call methods on bean
    System.out.println(theCoach.getDailyWorkout());

    // call dependent method, get fortune
    System.out.println(theCoach.getDailyFortune());

    // close application context
    context.close();
  }
}
