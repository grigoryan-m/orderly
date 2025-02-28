package com.grigoryanm.orderly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class OrderlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderlyApplication.class, args);
	}

}
