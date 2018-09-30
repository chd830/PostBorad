package ac.dankook.postboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ac.dankook.postboard.service.TestService;

@RestController
public class TestRestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public void test() {
        testService.testMybatisService();
    }
}
