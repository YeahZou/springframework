package com.yeah.study.springframework.aop;

import static java.lang.System.out;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 在业务执行前、业务执行后插入动作
 * @author techsure
 *
 */
@Aspect
public class DBAspect {

	/**
	 * 
	 * @param jp 目标方法
	 * @return
	 * @throws Throwable
	 */
	// 其他增强 Before、After、AfterThrowing 
	@Around("execution(* com.yeah.study.springframework.*.*(..))")
	public Object processTx(ProceedingJoinPoint jp) throws Throwable {
		out.println("before target method execute, do something...");
		
		Object obj = jp.proceed(new String[] {"changed parameter"});
		out.println("After execute target method, do something....");
		
		return obj + " Around method return.";
	}
}
