package com.telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.telusko.AppConfig.class);

        Alien obj= context.getBean(Alien.class);
        //obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();


//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1 = context.getBean(Desktop.class);
//        desktop1.compile();


//          ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//          Alien obj = (Alien)context.getBean("alien",Alien.class);
//          obj.code();
//          Desktop desktop = context.getBean(Desktop.class);


    }
}
