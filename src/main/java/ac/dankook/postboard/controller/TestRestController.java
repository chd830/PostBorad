package ac.dankook.postboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ac.dankook.postboard.service.TestService;

@RestController
public class TestRestController {

    @Autowired
    TestService testService;
    @RequestMapping(value="")
    public void test() {
        testService.testService();
    }
}
