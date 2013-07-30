package net.therap.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 7/30/13
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class AppStart {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");



        GreetingService greetingService =(GreetingService) applicationContext.getBean("Greeting");
        greetingService.greetinMessage();

    }
}
