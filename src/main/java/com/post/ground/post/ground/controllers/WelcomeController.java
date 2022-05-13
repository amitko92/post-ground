package com.post.ground.post.ground.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController()
public class WelcomeController {

    @GetMapping(path = "/")
    public Map<String,Object> welcome(
            HttpSession session){

        Map<String,Object> response = new HashMap<>();

        response.put("session", session.getId());

        return response;
    }
}
