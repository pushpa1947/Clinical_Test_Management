package org.example.service;

import org.example.dao.TestDao;
import org.example.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImplementation implements  TestService{


    @Autowired
    TestDao testDao;

    @Override
    public String addTest(Test test) {

        testDao.save(test);
        return "Added successfully";
    }

    @Override
    public String deleteTest(Test test) {
        testDao.deleteByTestName(test.getTestName());
        return "Test Deleted";
    }

    @Override
    public String modifyTest(Test test) {
        if(testDao.existsById(test.getId())){
            testDao.save(test);
            return "Modified Successfully";
        } else {
            return "Test with that Id is not present";

        }

    }


}
