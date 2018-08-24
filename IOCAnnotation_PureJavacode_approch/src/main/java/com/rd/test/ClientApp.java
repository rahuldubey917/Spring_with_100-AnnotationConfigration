package com.rd.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rd.beans.HelloSpring;
import com.rd.beans.HelloSpring2;
import com.rd.cfgs.applicationContext;

public class ClientApp {

			public static void main(String[] args) {

				ApplicationContext ctx= new AnnotationConfigApplicationContext(applicationContext.class);
				//ApplicationContext ctx2 =new AnnotationConfigApplicationContext(applicationContext2.class);
				HelloSpring hs=ctx.getBean(HelloSpring.class);
		        HelloSpring2 hs2=ctx.getBean(HelloSpring2.class);
				hs.hello();
				hs2.print();
		        //hs=ctx2.getBean(requiredType)
				

				((AbstractApplicationContext) ctx).close();
			}

		}

	


	
	
