package com.qa.spring.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.spring.di.xml.beans.Customer;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	  
	  Customer c1 = context.getBean("customer1", Customer.class);
	  System.out.println(c1);
	  
	  Customer c2 = context.getBean("customer2", Customer.class);
	  System.out.println(c2);
	  
	  Customer c3 = context.getBean("customer3", Customer.class);
	  System.out.println(c3);
  }
}
