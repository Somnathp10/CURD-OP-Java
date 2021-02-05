package com;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.EmployeeEntity;
import com.repository.EmployeeRepository;


@SpringBootApplication

public class SecurityExampleApplication {
 
   // private Logger logger = LoggerFactory.getLogger(this.getClass());
     
    @Autowired
    EmployeeRepository repository;

	public static void main(String[] args) {
		
		SpringApplication.run(SecurityExampleApplication.class, args);
	}

//	public void run(String... args) throws Exception 
//    {       
//        Optional<EmployeeEntity> emp = repository.findById(2L);
// 
//        //logger.info("Employee id 2 -> {}", emp.get());
//    }
}
