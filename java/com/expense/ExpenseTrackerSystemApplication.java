package com.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.jwt"})
public class ExpenseTrackerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerSystemApplication.class, args);
	}

}
