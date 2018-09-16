package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TestRepository;

@Service
public class TestServiceImpl {
    @Autowired
    TestRepository testRepository;
    public void testService() {
        testRepository.testRepository();
    }
}
