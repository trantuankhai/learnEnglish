package com.vn.tdk.learnenglish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vn.tdk.learnenglish.*")
public class LearnEnglishApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnEnglishApplication.class, args);
	}

}
