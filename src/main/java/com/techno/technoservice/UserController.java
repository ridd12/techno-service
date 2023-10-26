package com.techno.technoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "sign-up")
    public Boolean signUp(@RequestParam String userEmail,@RequestParam String password){
        return userService.signup(userEmail,password);
    }

    @GetMapping
    public String home(){
        return "fromBacked";
    }

}
