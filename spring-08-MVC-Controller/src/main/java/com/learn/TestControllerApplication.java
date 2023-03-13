package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class TestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestControllerApplication.class, args);
	}

}
