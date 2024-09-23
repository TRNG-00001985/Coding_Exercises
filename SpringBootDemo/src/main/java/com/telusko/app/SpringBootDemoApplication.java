package com.telusko.app;

import com.telusko.app.model.Alien;
import com.telusko.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.telusko.app.model.Laptop;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootDemoApplication.class, args);

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}