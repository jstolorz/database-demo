package com.reddragon.spring.database.jpa;


import com.reddragon.spring.database.entity.Person;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@EntityScan(basePackages = "com.reddragon.spring.database.entity")
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;


    public List<Person> findAll(){
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }

    public Person findByName(int id){
        return entityManager.find(Person.class,id);
    }


    public Person update(Person person){
        return entityManager.merge(person);
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }

    public void deleteById(int id){
        Person person = findByName(id);
        entityManager.remove(person);
    }


}
