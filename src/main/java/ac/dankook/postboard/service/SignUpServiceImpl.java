package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService{
    @Autowired
    SignUpRepository signUpRepository;

    public void setSignUpData(User user) {
        signUpRepository.setUserData(user);
    }
}
