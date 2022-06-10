package com.post.ground.post.ground.repositories.user;

import models.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface UsersRepository {

    public Optional<User> getUser(String userName, String password);
    public Optional<List<User>> getAllUsers(
            String userName,
            String password,
            String fName,
            String lName,
            String email,
            Date fromRegistrationDate,
            Date toRegistrationDate);
    public void deleteUser(int userId);
    public Optional<User> updateUser(int userId);
    public Optional<User> insertUser(User user);
}
