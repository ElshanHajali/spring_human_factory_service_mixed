package com.humandemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.humandemo.interfaces.Human;

public class DemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Human theHuman = context.getBean("disabledHuman", Human.class);
		Human theNormalHuman = context.getBean("normalHuman", Human.class);

		System.out.println(theHuman.arms());
		System.out.println(theHuman.legs());
		System.out.println(theHuman.head());		
		
		System.out.println("\n"+theNormalHuman.arms());
		System.out.println(theNormalHuman.legs());
		System.out.println(theNormalHuman.head());
		
		context.close();
		
	}

}
