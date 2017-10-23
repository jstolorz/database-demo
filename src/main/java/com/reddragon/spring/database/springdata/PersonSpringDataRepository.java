package com.reddragon.spring.database.springdata;

import com.reddragon.spring.database.entity.Person;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersonSpringDataRepository
        extends JpaRepository<Person, Integer>{
}