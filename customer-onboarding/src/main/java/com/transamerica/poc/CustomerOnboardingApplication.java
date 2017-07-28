package com.transamerica.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerOnboardingApplication {

	private static final Logger logger = LoggerFactory.getLogger(CustomerOnboardingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerOnboardingApplication.class, args);
		
		logger.info("-----------------------------------------------------\r");
		logger.info("		Transamerica Customer Onboarding\r");
		logger.info("-----------------------------------------------------");
		
	}
}
