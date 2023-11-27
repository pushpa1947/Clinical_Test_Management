package org.example.service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.example.dao.ReportDaoImplementation;
import org.example.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReportServiceImplementation implements ReportService {

    @Autowired
    ReportDaoImplementation reportDaoImplementation;

    @Override
    public Optional<Report> getAllReports(int reportId) {
        return reportDaoImplementation.findById(reportId);

    }
}

//    public byte[] generatePdfForReport(Optional<Report> report) {
//        PDDocument document = new PDDocument();
//        PDPage page = new PDPage();
//        document.addPage(page);
//
//        try {
//            PDPageContentStream contentStream = new PDPageContentStream(document, page);
//            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
//            contentStream.beginText();
//            contentStream.newLineAtOffset(20, 700);
//
//            contentStream.showText("Report ID: " + report.getReportId());
//            contentStream.newLine();
//            contentStream.showText("User ID: " + report.getUserId());
//            contentStream.newLine();
//            contentStream.showText("Result: " + report.getResult());
//            contentStream.newLine();
//
//            contentStream.endText();
//            contentStream.close();
//
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            document.save(baos);
//            document.close();
//
//            return baos.toByteArray();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new byte[0]; // or handle the exception according to your needs
//        }



