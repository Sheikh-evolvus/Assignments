package com.jpa.evo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.evo.model.Address;
import com.jpa.evo.model.User;
import com.jpa.evo.repo.Addressrepo;
import com.jpa.evo.repo.Userrepo;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	
			SpringApplication.run(OneToOneApplication.class, args);
	
	Addressrepo addressrepo=applicationContext.getBean(Addressrepo.class);
	Userrepo userrepo = applicationContext.getBean(Userrepo.class);
	
	Address address = new Address("baba naik colony");
	addressrepo.save(address);
	
	User user = new User("shabaz", address);
	userrepo.save(user);
	}

}
