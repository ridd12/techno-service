package com.techno.technoservice;

import com.techno.technoservice.entity.LoginInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "sign-up")
    public Boolean signUp(@RequestBody LoginInput loginInput){
        return userService.signup(loginInput.getUserEmail(),loginInput.getPassword());
    }

    @PostMapping(consumes = "application/json")
    public String login(@RequestBody Map<String,String> map){
        log.info("In Controller!");
        log.info(map.toString());
        return "Hi there";
    }

    @GetMapping
    public Map<String,String> getRiddhish(){
        HashMap<String,String> map=new HashMap<>();
        map.put("Riddhish","khot");
        return map;
    }
}
