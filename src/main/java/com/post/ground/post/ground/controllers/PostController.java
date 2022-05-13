package com.post.ground.post.ground.controllers;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController()
@RequestMapping(path = "posts")
public class PostController {


    @GetMapping(path = "/getAllPost")
    public Map<String,Object> getPostByUser(
            HttpSession session,
            @RequestParam("userId") int userId){

        Map<String,Object> response = new HashMap<>();

        response.put("session", session.getId());

        return response;
    }


}
