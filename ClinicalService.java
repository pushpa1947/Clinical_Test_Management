package org.example.service;

import org.example.model.Admin;
import org.example.model.User;

public interface ClinicalService {



    Admin checkAdmin(String username, String password);

    User checkUser(String username, String password);

    Admin checkAdmin(Admin admin);
}
