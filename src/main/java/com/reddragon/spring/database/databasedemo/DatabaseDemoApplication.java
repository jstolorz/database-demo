package com.reddragon.spring.database.databasedemo;

import com.reddragon.spring.database.entity.Person;
import com.reddragon.spring.database.jdbc.PersonJdbcDao;

import com.reddragon.spring.database.jpa.PersonJpaRepository;
import com.reddragon.spring.database.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@SpringBootApplication
@ComponentScan("com.reddragon.spring.database")
public class DatabaseDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Person person = new Person();

		person.setName("Bob");
		person.setLocation("Arcanasas");
		person.setBirtDate(new Date());


		logger.info("insert  -> {}", repository.insert(person));

		person.setName("Adrian");
		person.setLocation("Madryt");
		person.setBirtDate(new Date());

		logger.info("insert  -> {}", repository.update(person));

		logger.info("find 1 -> {} ", repository.findByName(1));

		logger.info("Find All -> {}", repository.findAll());



	}
}
