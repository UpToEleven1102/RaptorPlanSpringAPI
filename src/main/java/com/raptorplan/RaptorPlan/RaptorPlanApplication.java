package com.raptorplan.raptorplan;

import com.raptorplan.raptorplan.data.entity.CategoryEntity;
import com.raptorplan.raptorplan.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
