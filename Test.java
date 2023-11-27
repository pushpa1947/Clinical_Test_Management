package org.example.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "test_sample_type",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "sample_type_id")
    )
    private Set<SampleType> sampleTypes;

    @ManyToMany
    @JoinTable(
            name = "test_department",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "department_id")
    )
    private Set<Department> departments;
    private double cost;
    private String testName;

    private String testType;

    public Test(Long id, Set<SampleType> sampleTypes, Set<Department> departments, double cost, String testName, String testType) {
        this.id = id;
        this.sampleTypes = sampleTypes;
        this.departments = departments;
        this.cost = cost;
        this.testName = testName;
        this.testType = testType;
    }

    public Test() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public Set<SampleType> getSampleTypes() {
        return sampleTypes;
    }

    public void setSampleTypes(Set<SampleType> sampleTypes) {
        this.sampleTypes = sampleTypes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }





}


