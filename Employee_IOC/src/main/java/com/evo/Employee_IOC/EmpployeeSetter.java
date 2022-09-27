package com.evo.Employee_IOC;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmpployeeSetter {

	private String name;
	private int id;
	private Map<String, String> detail;

	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, String> getDetail() {
		return detail;
	}
	public void setDetail(Map<String, String> detail) {
		this.detail = detail;
	}
		public void display() {
		System.out.println("name of the employee is= "+name);
		System.out.println("id of employee is= "+id);
//		
//		 System.out.println("Answers....");  
//		 for (Map.Entry<String,String> entry : detail.entrySet())
//	            System.out.println(entry.getKey() + ": " + entry.getValue());
//	
	
}
}