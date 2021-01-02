package com.yash.lifecycledemobeaninterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean,DisposableBean{
	public void customer()
	{
		System.out.println("This demo of life cycle methods");
	}
	
	

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}



	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
}
