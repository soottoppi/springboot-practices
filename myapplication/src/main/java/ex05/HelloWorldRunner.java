package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import ex05.component.MyComponent;

public class HelloWorldRunner implements ApplicationRunner {
	@Autowired
	private MyComponent myComponent;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		myComponent.printHello();
	}

}
