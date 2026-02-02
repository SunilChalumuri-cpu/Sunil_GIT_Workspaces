package edu.aspire.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import edu.aspire.beans.GreetingService;

public class HelloClient {
	public static void main(String[] args) {
		// Spring Container
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/applicationContext.xml"));

		// Spring Framework
		//ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("*********");

		GreetingService gs1 = (GreetingService) factory.getBean("gs1");
		GreetingService gs2 = (GreetingService) factory.getBean("gs2");

		gs1.sayGreeting();
		gs2.sayGreeting();
	}
}
