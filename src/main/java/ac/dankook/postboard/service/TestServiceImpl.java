package ac.dankook.postboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.dankook.postboard.repository.TestRepository;

@Service
public class TestServiceImpl {
    @Autowired
    TestRepository testRepository;
    public void testService() {
        testRepository.testRepository();
    }
}
