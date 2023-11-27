package org.example.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;

    @ManyToMany(mappedBy = "departments")
    private Set<Test> tests;

    public Department() {

    }

    public Long getId() {
        return id;
    }

    public Department(Long id, String departmentName, Set<Test> tests) {
        this.id = id;
        this.departmentName = departmentName;
        this.tests = tests;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }




}
