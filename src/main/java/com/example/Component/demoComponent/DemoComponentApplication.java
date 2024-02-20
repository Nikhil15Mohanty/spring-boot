package com.example.Component.demoComponent;

import com.example.Component.demoComponent.Controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoComponentApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(DemoComponentApplication.class, args);
		PizzaController pizza = context.getBean(PizzaController.class);
		System.out.println(pizza.display());
	}

}
