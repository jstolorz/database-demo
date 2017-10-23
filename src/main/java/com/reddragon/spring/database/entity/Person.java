package com.reddragon.spring.database.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;

    @Column(name = "BIRTH_DATE")
    private Date birtDate;

    public Person() {

    }

    public Person(int id,String name, String location, Date birtDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birtDate = birtDate;
    }


    public Person(String name, String location, Date birtDate) {

        this.name = name;
        this.location = location;
        this.birtDate = birtDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birtDate=" + birtDate +
                '}';
    }
}
