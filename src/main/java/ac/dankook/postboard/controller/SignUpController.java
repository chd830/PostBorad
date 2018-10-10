package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.LogIn;
import ac.dankook.postboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SignUpController {

    private static Logger LOGGER = LoggerFactory.getLogger(SignUpController.class);

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }


}
