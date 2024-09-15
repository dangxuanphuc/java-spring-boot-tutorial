package org.phucdx;

import org.phucdx.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop dt = context.getBean("desktop", Desktop.class);
        dt.compile();



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = context.getBean("alien1", Alien.class);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Alien obj2 = context.getBean("alien1", Alien.class);
//        System.out.println(obj2.age);
//        obj2.code();

//        Computer com = context.getBean(Computer.class);
//        Desktop obj = context.getBean(Desktop.class);
    }
}
