package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Employee;
import com.capg.beans.SBU;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/config/springConfig.xml");
		
		SBU sbu=container.getBean("sbu",SBU.class);

		System.out.println(sbu);
		
	}
}
