package com.post.ground.post.ground.services;

import com.post.ground.post.ground.repositories.user.LoggedInUsersRepository;
import com.post.ground.post.ground.repositories.user.MySqlUsersRepository;
import models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final LoggedInUsersRepository loggedInUsersRepository;
    private final MySqlUsersRepository mySqlUsersRepository;

    public UserService(LoggedInUsersRepository loggedInUsersRepository, MySqlUsersRepository mySqlUsersRepository) {
        this.loggedInUsersRepository = loggedInUsersRepository;
        this.mySqlUsersRepository = mySqlUsersRepository;
    }

    public Optional<User> getUser(String userName, String password){

        Optional<User> optionalUser = loggedInUsersRepository.getUser(userName, password);

        if(optionalUser.isPresent()){
            return optionalUser;
        }

        optionalUser = mySqlUsersRepository.getUser(userName, password);

        return optionalUser;
    }
}
