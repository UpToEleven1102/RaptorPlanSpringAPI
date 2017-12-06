package com.raptorplan.RaptorPlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//TODO: institutional page

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class RaptorPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaptorPlanApplication.class, args);
	}
}
