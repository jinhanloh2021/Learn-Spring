package someFolder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
  public static void main(String[] args) {
    // load the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

    // retrieve beans from spring container
    Coach theCoach = context.getBean("myCoach", Coach.class); // singleton. Will get same reference.

    // lifecycle methods. Initialiser and destructor.
    System.out.println(theCoach.getDailyWorkout());

    // close context
    context.close();
  }
}
