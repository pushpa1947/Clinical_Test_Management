package org.example.service;

import org.example.model.Test;

public interface TestService {


    String addTest(Test test);

    String deleteTest(Test test);

    String modifyTest(Test test);
}
