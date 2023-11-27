package org.example.dao;

import org.example.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test,Long> {


     void deleteByTestName(String testName);

}
