/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Madhukar
 * 1. define a new Coach implementation using Annotations
 * 2. Reference the new coach implementation in your main application.
 * 3. Test your application to verify you are getting info from your new coach implementation
 *
 */
@Component
public class LudoCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise dice rolling 50 times";
	}

}
