package org.example.service;

import org.example.model.Report;

import java.util.Optional;

public interface ReportService {

//    Optional<Report> getAllReports(int userId);



//    public byte[] generatePdfForReport(Optional<Report> report);


    Optional<Report> getAllReports(int userId);
}
