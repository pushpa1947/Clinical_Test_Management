package org.example.controller;

import org.example.dto.StatusDto;
import org.example.model.Admin;
import org.example.service.ClinicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
@RequestMapping("/admin")
public class AdminControler {

    @Autowired
    ClinicalService clinicalService;


    @GetMapping("/login")
    public String showLoginForm(Model model) {
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "login";
    }



    @PostMapping("/checkAdmin")
    public String LoginForm(@ModelAttribute Admin admin, Model model) {
        System.out.println("In checkAdmin");
        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());
        Admin dbAdmin = clinicalService.checkAdmin(admin);
        System.out.println("dbAdmin " + dbAdmin);

        if (Objects.nonNull(dbAdmin) && dbAdmin.getUsername().equalsIgnoreCase(admin.getUsername())
                && dbAdmin.getPassword().equalsIgnoreCase(admin.getPassword())) {
            // Username and password match a record in the database
            model.addAttribute("msg","Welcome to Synchronoss");
            System.out.println("QQQQQ");
            return "AdminMain";
        } else {

            // Username and password do not match any record in the database

            model.addAttribute("msg","invalid userName or password");
            return "login";
        }


    }


}
