package com.singleton.evo.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        
        Single single= (Single)context.getBean("shabaz");
       single.setName("sheik shabaz");
       System.out.println(single.getName());
       
       Single single2= (Single)context.getBean("shabaz");
       single.setName("sheik shabaz hussain");
       System.out.println(single.getName());
       
       
       //comparing the ref
       System.out.println(single == single2);
       
       //address of object
       System.out.println(single);
       System.out.println(single2);
       
       
    }
}
