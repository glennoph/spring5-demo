package net.gospring.spring5demo;

import net.gospring.spring5demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5demoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring5demoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();
	}
}
