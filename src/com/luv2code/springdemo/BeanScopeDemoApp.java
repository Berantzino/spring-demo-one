package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Practice Activity #3 - Bean Scopes with XML Config
		Coach thePracticeCoach = context.getBean("myPracticeCoach", Coach.class);
		Coach alphaPracticeCoach = context.getBean("myPracticeCoach", Coach.class);
		
		// check if they are the same bean
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// Practice Activity #3 - Bean Scopes with XML Config - SOUTS
		boolean practiceResult = (thePracticeCoach == alphaPracticeCoach);
		System.out.println("\nPointing to the same object: " + practiceResult);
		System.out.println("\nMemory location for theCoach: " + thePracticeCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaPracticeCoach);
		
		// close the context
		context.close();
	}
}