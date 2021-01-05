package com.madhu.springdemo;

import org.springframework.stereotype.Component;

/**
 * POJO
 * @author Madhukar
 *
 */
// Add the @Component Annotation to your Java classes
//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	// create a no-arg constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Do a backhand volley for 15 mins";
	}
}
