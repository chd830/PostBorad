package ac.dankook.postboard.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.dankook.postboard.repository.TestRepository;

@Service
public class TestServiceImpl {
    @Autowired
    TestRepository testRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);
    public void testMybatisService() {
        testRepository.testMybatisRepository();
    }
}
