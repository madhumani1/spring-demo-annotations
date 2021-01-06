/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Madhukar
 *
 */
public class AnnotationBeanProcessorDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the spring configuration file
		// retrieve bean from spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("kabaddiCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		// close the context
		context.close();
	}

}
