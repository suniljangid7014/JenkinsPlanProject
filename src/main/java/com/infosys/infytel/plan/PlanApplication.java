package com.infosys.infytel.plan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PlanApplication  extends SpringBootServletInitializer {
	
	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(PlanApplication.class);
	   }
	 //this is a comment
	public static void main(String[] args) {
		SpringApplication.run(PlanApplication.class, args);
	}
}