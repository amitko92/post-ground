package com.post.ground.post.ground.repositories.user;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class MySqlUsersRepository implements UsersRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    RowMapper<User> rowMapper = (rs, rowNum) -> {

        Date registrationDate = null;
        String dateStr = rs.getString("registration_date"); // 2022-05-14 00:00:00

        try {
            registrationDate = dateFormat.parse(dateStr);
        } catch (ParseException e) {

            registrationDate = new Date(-1L);
            e.printStackTrace();
        }

        User user = new User(
                rs.getInt("id"),
                rs.getString("user_name"),
                rs.getString("password"),
                rs.getString("email"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                registrationDate
                );

        return user;
    };

    @Override
    public Optional<User> getUser(String userName, String password) {
        String sqlQuery = "select * from users where user_name=? and password=?";
        User user = null;

        try{

            //user = jdbcTemplate.queryForObject(sqlQuery,new Object[]{userName, password}, rowMapper);
            user = jdbcTemplate.queryForObject(sqlQuery, new Object[]{userName, password}, new int []{1,2}, rowMapper);
        }catch (DataAccessException e){
            e.printStackTrace();
            System.out.println(e.toString());

        }

        System.out.println("retrive user from MySqlUsersRepository user: " + user.toString());
        return Optional.ofNullable(user);
    }

    @Override
    public Optional<List<User>> getAllUsers(String userName, String password, String fName, String lName, String email, Date fromRegistrationDate, Date toRegistrationDate) {
        return Optional.empty();
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public Optional<User> updateUser(int userId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> insertUser(User user) {
        return Optional.empty();
    }
}
