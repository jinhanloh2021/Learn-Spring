package someFolder;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging.*;
//have to download spring-5.3.9-dist.zip before I can use this class.

public class HelloSpringApp {
  public static void main(String[] args) {
    // load the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from spring container
    Coach theCoach = context.getBean("myCoach", Coach.class);
    // call methods on bean
    System.out.println(theCoach.getDailyWorkout());
    // close application context
    context.close();
  }
}
