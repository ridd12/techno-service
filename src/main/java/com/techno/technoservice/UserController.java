package com.techno.technoservice;

import com.techno.technoservice.entity.LoginInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "sign-up")
    public Boolean signUp(@RequestBody LoginInput loginInput){
        return userService.signup(loginInput.getUserEmail(),loginInput.getPassword());
    }
}
