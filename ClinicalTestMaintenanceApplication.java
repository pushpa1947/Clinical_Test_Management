package org.example;

import org.example.controller.AdminControler;
import org.example.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicalTestMaintenanceApplication {

    @Autowired
    AdminControler adminControler;

//    @Autowired
//    UserController userController;

    public static void main(String[] args) {

        SpringApplication.run(ClinicalTestMaintenanceApplication.class);
        System.out.println("In main");

        }
    }
