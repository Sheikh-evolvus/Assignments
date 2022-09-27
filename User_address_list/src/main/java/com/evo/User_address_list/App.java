package com.evo.User_address_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        User_Address user_Address= context.getBean("add",User_Address.class);
        user_Address.info();
        
        User_Address user_Address1= context.getBean("add1",User_Address.class);
        user_Address1.info();
    }
}
