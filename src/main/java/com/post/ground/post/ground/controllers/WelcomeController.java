package com.post.ground.post.ground.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController()
public class WelcomeController {

    @GetMapping(path = "/")
    public Map<String,Object> welcome(
            HttpSession session,
            @RequestParam("userName") String userName,
            @RequestParam("password") String password){

        Map<String,Object> response = new HashMap<>();

        response.put("message", "user is logged in");
        response.put("status", "success");
        return response;
    }
}
