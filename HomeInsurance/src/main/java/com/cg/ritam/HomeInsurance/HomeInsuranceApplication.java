package com.cg.ritam.HomeInsurance;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



//@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})


@SpringBootApplication
public class HomeInsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeInsuranceApplication.class, args);
	}

}

