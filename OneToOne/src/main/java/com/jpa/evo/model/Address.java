package com.jpa.evo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Table")
public class Address {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String street;

	public Address(String street) {
		super();
		this.street = street;
	}

	
	
}
