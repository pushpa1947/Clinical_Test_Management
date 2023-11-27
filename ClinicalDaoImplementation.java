package org.example.dao;

import org.example.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicalDaoImplementation extends JpaRepository<Admin, Integer> {
    Admin findByUsernameAndPassword(String username, String password);

}


