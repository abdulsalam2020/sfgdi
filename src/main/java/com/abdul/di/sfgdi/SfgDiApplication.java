package com.abdul.di.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abdul.di.sfgdi.controller.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		String msg = controller.sayHello();
		System.out.println(msg);
		
	}

}
