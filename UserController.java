package org.example.controller;


import org.example.model.Report;
import org.example.model.User;
import org.example.service.ClinicalService;
import org.example.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    ClinicalService clinicalService;


    @Autowired
    ReportService reportService;

    @RequestMapping("/checkUser")
    public String checkadmin(@RequestParam String username, @RequestParam String password , Model model) {


        User user = clinicalService.checkUser(username, password);
        System.out.println("User " + user);

        if (user != null) {
            // Username and password match a record in the database
            model.addAttribute("msg", "Welcome to Synchronoss");
            return "UserMain";
        } else {
            // Username and password do not match any record in the database
            return "Invalid";
        }
    }


    @GetMapping("/reports")
    public ResponseEntity<byte[]> getAllReports(@RequestParam int reportId) {

        Optional<Report> report = reportService.getAllReports(reportId);

        if (report == null) {
            return ResponseEntity.notFound().build();
        }

//            byte[] pdfContent = reportService.generatePdfForReport(report);
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_PDF);
//            headers.setContentDisposition(ContentDisposition.builder("inline").filename("report.pdf").build());
//
//            return new ResponseEntity<>(pdfContent, headers, HttpStatus.OK);


return null;
    }
}
