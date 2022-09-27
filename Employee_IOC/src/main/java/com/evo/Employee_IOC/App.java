package com.evo.Employee_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmpployeeSetter empployeeSetter=context.getBean("Emp", EmpployeeSetter.class);
        empployeeSetter.display();
       
        EmpployeeSetter empployeeSetter1=context.getBean("Emp1", EmpployeeSetter.class);
        empployeeSetter1.display();
        
        EmpployeeSetter empployeeSetter2=context.getBean("Emp2", EmpployeeSetter.class);
        empployeeSetter2.display();
        
//        EmpployeeSetter empployeeSetter3=context.getBean("Emp3", EmpployeeSetter.class);
//        empployeeSetter3.display();
    }
}
