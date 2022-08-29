package myPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
  public static void main(String[] args) {
    // read spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // get bean from spring container
    // Coach myCoach = context.getBean("MyTennisCoach", Coach.class);
    Coach myCoach = context.getBean("tennisCoach", Coach.class);

    // call methods on bean
    System.out.println(myCoach.getDailyWorkout());

    // close container
    context.close();
  }
}
