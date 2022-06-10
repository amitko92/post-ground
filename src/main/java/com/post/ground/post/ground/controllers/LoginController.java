package com.post.ground.post.ground.controllers;

import com.post.ground.post.ground.commen.models.session.SessionManager;
import com.post.ground.post.ground.services.UserService;
import models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController()
public class LoginController {

    private final SessionManager sessionManager;
    private final UserService userService;

    public LoginController(SessionManager sessionManager, UserService userService) {
        this.sessionManager = sessionManager;
        this.userService = userService;
    }

    @PostMapping(path = "/login")
    public Map<String,Object> login(
            HttpSession session,
            @RequestParam("userName") String userName,
            @RequestParam("password") String password){

        Map<String,Object> response = new HashMap<>();
        response.put("message", "user is logged in");
        response.put("status", "success");
        User user = null;
        Optional<User> optionalUser = userService.getUser(userName, password);

        if(optionalUser.isEmpty()){

            response.put("message", "failed to login");
            response.put("status", "fail");

            return response;
        }

        user = optionalUser.get();
        sessionManager.addUserToSession(session.getId(), user);
        response.put("user", user);
        return response;
    }
}
