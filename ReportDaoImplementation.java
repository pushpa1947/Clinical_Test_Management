package org.example.dao;

import org.example.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportDaoImplementation extends JpaRepository<Report,Integer> {
}
