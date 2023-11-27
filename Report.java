package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Report {

    @Id
    private int reportId;
    private int userId;
    private String result;



    public Report(int reportId, int userId, String result) {
        this.reportId = reportId;
        this.userId = userId;
        this.result = result;
    }

    public Report() {

    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



}
