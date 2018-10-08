package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpRestController {

    @Autowired
    SignUpService signUpService;

    @RequestMapping(value="/rest/signup", method = RequestMethod.POST)
    public void setSingUpData(@RequestParam String userId,@RequestParam String userPw, @RequestParam String userName, @RequestParam String email) {
        User user = new User();
        user.setUserId(userId);
        user.setUserPw(userPw);
        user.setUserName(userName);
        user.setEmail(email);
        signUpService.setSignUpData(user);
    }


}
