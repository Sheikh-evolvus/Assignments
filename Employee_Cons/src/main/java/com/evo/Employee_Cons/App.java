package com.evo.Employee_Cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeCons employeeCons= context.getBean("Emp",EmployeeCons.class);
        employeeCons.info();
        
        EmployeeCons employeeCons1= context.getBean("Emp1",EmployeeCons.class);
        employeeCons1.info();
        
        EmployeeCons employeeCons2= context.getBean("Emp2",EmployeeCons.class);
        employeeCons2.info();
    }
}
