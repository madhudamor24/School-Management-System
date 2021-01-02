package springproject.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  
  public static void main(String[] args) {
	  System.out.println("Program start....");
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring"); 
  }
	  
}
 