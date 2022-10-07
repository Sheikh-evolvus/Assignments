package com.jpa.evo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.evo.model.Address;

@Repository
public interface Addressrepo extends CrudRepository<Address, Long>{

	
	
}
