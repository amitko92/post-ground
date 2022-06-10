package com.post.ground.post.ground.repositories.user;

import com.post.ground.post.ground.repositories.user.UsersRepository;
import models.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class LoggedInUsersRepository implements UsersRepository {

    private HashMap<String, User> loggedInUsers;

    public LoggedInUsersRepository(){

        loggedInUsers = new HashMap<>();
    }

    public void addUser(String sessionId, User user){

        loggedInUsers.put(sessionId, user);
    }

    public void removeUser(String sessionId){

        loggedInUsers.remove(sessionId);
    }

    public Optional<User> getUserBySessionId(String sessionId) {
        User user = null;

        if(loggedInUsers.containsKey(sessionId)){

            user = loggedInUsers.get(sessionId);
        }

        return Optional.ofNullable(user);
    }

    @Override
    public Optional<User> getUser(String userName, String password) {

        Optional<User> optionalUser = loggedInUsers.values()
                .stream()
                .filter(v -> v.getPassword().equals(password) && v.getUserName().equals(userName))
                .findFirst();

        if(optionalUser.isEmpty()){
            return Optional.empty();
        }

        return optionalUser;
    }

    @Override
    public Optional<List<User>> getAllUsers(String userName, String password, String fName, String lName, String email, Date fromRegistrationDate, Date toRegistrationDate) {
        return Optional.empty();
    }

    @Override
    public void deleteUser(int userId) {

        loggedInUsers = loggedInUsers.entrySet()
                .stream()
                .filter(e -> e.getValue().getId() != userId)
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (prev, next) -> next, HashMap::new));
    }

    @Override
    public Optional<User> updateUser(int userId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> insertUser(User user) {
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "LoggedInUsersRepository{" +
                "loggedInUsers=" + loggedInUsers +
                '}';
    }

    public static void main(String[] args) {
        LoggedInUsersRepository loggedInUsersRepository = new LoggedInUsersRepository();

        User user = new User(1, "amitko","1","email","amit", "koren", new Date());
        User user2 = new User(2, "amitko2","1","email","amit", "koren", new Date());
        User user3 = new User(3, "amitko3","1","email","amit", "koren", new Date());
        String pass = "11";
        String userName = "amitko";
        loggedInUsersRepository.addUser("a", user);
        loggedInUsersRepository.addUser("b", user2);
        loggedInUsersRepository.addUser("c", user3);

        //loggedInUsersRepository.getUser(user.getUserName(), pass);
        //System.out.println(loggedInUsersRepository);
        loggedInUsersRepository.deleteUser(1);
        System.out.println(loggedInUsersRepository);
    }

}
