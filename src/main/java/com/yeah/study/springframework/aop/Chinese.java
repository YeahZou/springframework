package com.yeah.study.springframework.aop;

import static java.lang.System.out;

import org.springframework.stereotype.Component;

/**
 * 模拟业务逻辑
 * @author techsure
 *
 */
@Component
public class Chinese {

	public String sayHello(String name) {
		out.println("run sayHello...");
		
		return name + " this is first spring aop";
	}
	
	public void eat(String food) {
		out.println("I'm eating " + food);
	}
}
