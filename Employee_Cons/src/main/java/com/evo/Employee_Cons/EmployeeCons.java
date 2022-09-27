package com.evo.Employee_Cons;

public class EmployeeCons {

	private String name;
	private int id;
	public EmployeeCons(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void info()
	{
		System.out.println("employee name is= "+ name);
		System.out.println("employee id is= "+ id);
	}
	
}
