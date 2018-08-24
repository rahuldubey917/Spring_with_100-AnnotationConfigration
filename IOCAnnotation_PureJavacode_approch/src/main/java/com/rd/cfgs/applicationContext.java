package com.rd.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rd.beans.HelloSpring;

@Configuration
@ComponentScan(basePackages="com.rd")
public class applicationContext {
	@Bean
	public HelloSpring getHelloSpring()
	{
		HelloSpring hs=new HelloSpring();
		return hs;
		
	}

	
}
