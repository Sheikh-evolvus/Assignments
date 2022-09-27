package com.evo.User_address_list;

import java.util.List;

public class User_Address {

	List address;

	public List getAddress() {
		return address;
	}

	public void setAddress(List address) {
		this.address = address;
		
		
	}
	public void info()
	{
		System.out.println("user address is= "+ address);
	}
}
