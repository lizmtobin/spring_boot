package com.qa.dfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDfeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDfeApplication.class, args);

		DFEController controllerBean = context.getBean(DFEController.class);

		System.out.println(controllerBean);

		DFEController myController = new DFEController(new DFEServiceList());
	}

}