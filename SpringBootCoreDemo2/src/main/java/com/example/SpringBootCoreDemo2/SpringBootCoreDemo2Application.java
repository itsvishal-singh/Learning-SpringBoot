package com.example.SpringBootCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemo2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootCoreDemo2Application.class, args);
//		PaymentGateway paymentGateway = applicationContext.getBean(PaymentGateway.class);
//		paymentGateway.print();
//		System.out.println(paymentGateway.getType());
//		System.out.println(paymentGateway.getRetry());
//		System.out.println(paymentGateway.isEnabled());
//		System.out.println(paymentGateway.getTimeout());
	}

}
