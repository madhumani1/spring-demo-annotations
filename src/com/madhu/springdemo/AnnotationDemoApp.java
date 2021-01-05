/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Madhukar
 *
 */
public class AnnotationDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the spring configuration file
		// retrieve bean from spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		theCoach = context.getBean("ludoCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
