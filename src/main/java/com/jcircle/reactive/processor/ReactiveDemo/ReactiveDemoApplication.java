package com.jcircle.reactive.processor.ReactiveDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(basePackages = "com.jcircle.reactive.processor")
@Configuration
@EnableAsync
@SpringBootApplication
public class ReactiveDemoApplication {

	public static void main(String[] args) {
		System.out.println("-------Inside App Main---");
		SpringApplication.run(ReactiveDemoApplication.class, args);
	}

}
