package someFolder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
  public static void main(String[] args) {
    // load the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

    // retrieve beans from spring container
    Coach theCoach = context.getBean("myCoach", Coach.class); // singleton. Will get same reference.
    Coach alphaCoach = context.getBean("myCoach", Coach.class);

    // check if theCoach and alphaCoach point to the same object.
    // singleton, they will be the same
    // prototype, new object for each request (for each getBean()).
    String outputString = theCoach == alphaCoach ? "The Coaches are the same." : "The Coaches are different.";
    System.out.println(outputString);
    System.out.println("theCoach memory location: " + theCoach);
    System.out.println("alphaCoach memory location: " + alphaCoach);

    // close context
    context.close();
  }
}
