package ac.dankook.postboard.controller;

import ac.dankook.postboard.repository.TestRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ac.dankook.postboard.service.TestService;

@RestController
public class TestRestController {

    @Autowired
    private TestService testService;
    static final Logger LOGGER = LoggerFactory.getLogger(TestRestController.class);
    @RequestMapping(value="/test",method= RequestMethod.GET)
    public void test() {
        LOGGER.debug("TestRestController");
        testService.testMybatisService();
    }
}
