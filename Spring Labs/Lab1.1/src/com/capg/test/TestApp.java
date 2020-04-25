package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Employee;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/config/springConfig.xml");
		Employee employ=container.getBean("emp",Employee.class);
		System.out.println("Employee Info");
		System.out.println("-----------------------");
		System.out.println("Employee ID :"+" "+employ.getEmpId());
		System.out.println("Employee Name :"+" "+employ.getEmpName());
		System.out.println("Employee Salary :"+" "+employ.getSalary());
		System.out.println("Employee BU :"+" "+employ.getBusinUnit());
		System.out.println("Employee Age :"+" "+employ.getAge());
	}
}
