package org.example.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class SampleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "sampleTypes")
    private Set<Test> tests;
    private String sampleTypeName;

    public SampleType() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSampleTypeName() {
        return sampleTypeName;
    }

    public void setSampleTypeName(String sampleTypeName) {
        this.sampleTypeName = sampleTypeName;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public SampleType(Long id, Set<Test> tests, String sampleTypeName) {
        this.id = id;
        this.tests = tests;
        this.sampleTypeName = sampleTypeName;
    }
}
