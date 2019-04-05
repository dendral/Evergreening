package com.hsbc.hbmx.leap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.hsbc.hbmx.leap.*"})
public class LeapIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeapIntegrationApplication.class, args);
	}

}
