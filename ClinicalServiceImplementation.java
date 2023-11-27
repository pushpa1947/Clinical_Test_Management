package org.example.service;

import org.example.dao.ClinicalDaoImplementation;
import org.example.dao.ClinicalUserDaoImplementation;
import org.example.model.Admin;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicalServiceImplementation implements ClinicalService{


    private final ClinicalDaoImplementation clinicalDaoImplementation;

    @Autowired
    public ClinicalServiceImplementation(ClinicalDaoImplementation clinicalDaoImplementation) {
        this.clinicalDaoImplementation = clinicalDaoImplementation;
    }

    @Autowired
    ClinicalUserDaoImplementation clinicalUserDaoImplementation;


    @Override
    public Admin checkAdmin(String username, String password) {

            Admin admin = clinicalDaoImplementation.findByUsernameAndPassword(username,password);

            return admin;
}

    @Override
    public User checkUser(String username, String password) {
        User user = clinicalUserDaoImplementation.findByUsernameAndPassword(username,password);

        return user;
    }

    @Override
    public Admin checkAdmin(Admin admin) {
        Admin admins = clinicalDaoImplementation.findByUsernameAndPassword(admin.getUsername(),admin.getPassword());

        return admins;
    }
}

