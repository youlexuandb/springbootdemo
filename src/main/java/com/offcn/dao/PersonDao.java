package com.offcn.dao;

import com.offcn.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Long> {

    public Person findByNameIs(String name);
}
