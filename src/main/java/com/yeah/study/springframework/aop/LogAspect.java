package com.yeah.study.springframework.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import static java.lang.System.out;
@Aspect
public class LogAspect {

	/**
	 * 
	 * @param obj 目标方法的返回值
	 */
	@AfterReturning(returning="obj", pointcut="execution(* com.yeah.study.springframework.*.*(..))")
	public void log(Object obj) {
		out.println("received target method return: " + obj);
		out.println("insert log...");
	}
}
