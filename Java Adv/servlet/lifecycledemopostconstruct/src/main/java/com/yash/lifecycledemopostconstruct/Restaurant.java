package com.yash.lifecycledemopostconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
	public void customer()
	{
		System.out.println("This demo of life cycle methods");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Bean is created");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean is destroyed");
	}
}
