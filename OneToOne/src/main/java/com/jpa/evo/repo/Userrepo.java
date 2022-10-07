package com.jpa.evo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.evo.model.User;

@Repository
public interface Userrepo extends CrudRepository<User, Long>{

}
