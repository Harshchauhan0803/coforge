package com.coforge.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect

//@Component
public class MyAop {
	@After("execution(* com.coforge.aop.MYCode.display(..))")
	public void aopAfter() {
		System.out.println("Called After Display");
}
	@Before("execution(* com.coforge.aop.MYCode.display(..))")
	public void aopBefore() {
		System.out.println("Called Before Display");
}
}

