package com.evo.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MessageCodeFormatter;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        message message =  context.getBean("msg", com.evo.ApplicationContext.message.class);
        message.details();
    }
}
