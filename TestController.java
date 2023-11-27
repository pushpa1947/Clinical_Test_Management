package org.example.controller;

import org.example.model.Test;
import org.example.service.ClinicalService;
import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;


    @RequestMapping("/addtest")
    public String addTest(@ModelAttribute Test test, Model model){
        System.out.println("In test "+ test);
        System.out.println(test.getId());
        System.out.println(test.getTestName());

        System.out.println(test.getTestType());
        System.out.println(test.getCost());
        System.out.println(test.getSampleTypes());


        String resp = testService.addTest(test);
        return resp;
    }

    @RequestMapping("/deletetest")
    public String daleteTest(@RequestBody Test test){
        System.out.println("In test "+ test);
        String resp = testService.deleteTest(test);
        return resp;
    }

    @RequestMapping("/modifytest")
    public String modifyTest(@RequestBody Test test){
        System.out.println("In test "+ test);
        String resp = testService.modifyTest(test);
        return resp;
    }




}
