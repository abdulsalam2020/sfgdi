package com.abdul.di.sfgdi;

import com.abdul.di.sfgdi.controller.ConstructorInjectedController;
import com.abdul.di.sfgdi.controller.PropertyInjectedController;
import com.abdul.di.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abdul.di.sfgdi.controller.MyController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		String msg = controller.sayHello();
		System.out.println(msg);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		propertyInjectedController.greet();

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		setterInjectedController.greet();

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		constructorInjectedController.greet();
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> doubleList = list.stream().map(e-> e*2).collect(Collectors.toList());
//		System.out.println(doubleList);

		
	}

}
