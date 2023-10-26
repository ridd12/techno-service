package com.techno.technoservice;


import com.techno.technoservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Boolean signup(String userEmail,String password){
        if(userRepository.findByEmail(userEmail)==null){
            User savedUser=userRepository.save(User.builder().email(userEmail).password(password).build());
            return true;
        }else{
            return false;
        }
    }
}
