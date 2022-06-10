package com.post.ground.post.ground.commen.models.session;

import com.post.ground.post.ground.repositories.user.LoggedInUsersRepository;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SessionManager {

    final LoggedInUsersRepository loggedInUsersManager;

    @Autowired
    public SessionManager(LoggedInUsersRepository loggedInUsersManager) {
        this.loggedInUsersManager = loggedInUsersManager;
    }

    public void addUserToSession(String sessionId, User user){

        loggedInUsersManager.addUser(sessionId, user);
    }

    public void removeUserFromSession(User user, String sessionId){

        loggedInUsersManager.removeUser(sessionId);
    }

    public boolean hesSession(String sessionId){

        Optional<User> optionalUser = loggedInUsersManager.getUserBySessionId(sessionId);

        return optionalUser.isPresent();
    }

    public Optional<User> getUserDetails(String sessionId){
        User user = null;

        Optional<User> optionalUser = loggedInUsersManager.getUserBySessionId(sessionId);

        if(optionalUser.isEmpty()){
            return Optional.empty();
        }


        return Optional.ofNullable(user);
    }

}
