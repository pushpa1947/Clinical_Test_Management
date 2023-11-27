package org.example.dao;

import org.example.model.Admin;
import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicalUserDaoImplementation extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password);
}
