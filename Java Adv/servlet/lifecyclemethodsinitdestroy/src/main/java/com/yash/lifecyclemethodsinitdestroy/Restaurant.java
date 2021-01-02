package com.yash.lifecyclemethodsinitdestroy;

public class Restaurant {
	public void customer()
	{
		System.out.println("This demo of life cycle methods");
	}
	public void init()
	{
		System.out.println("Bean is created");
	}
	public void destroy()
	{
		System.out.println("Bean is destroyed");
	}
}
