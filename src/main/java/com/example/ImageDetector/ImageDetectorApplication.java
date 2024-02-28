package com.example.ImageDetector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ImageDetectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageDetectorApplication.class, args);
	}

}
