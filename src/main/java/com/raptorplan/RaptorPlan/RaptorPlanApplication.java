package com.raptorplan.raptorplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@AutoConfigurationPackage
public class RaptorPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaptorPlanApplication.class, args);

	}
}
