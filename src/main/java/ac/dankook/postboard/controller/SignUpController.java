package ac.dankook.postboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }
}
