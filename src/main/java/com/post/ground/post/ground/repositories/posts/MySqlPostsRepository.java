package com.post.ground.post.ground.repositories.posts;

import models.Post;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Optional;

public class MySqlPostsRepository implements PostsRepository{

    RowMapper<Post> rowMapper = (rs, rowNum) -> {
        Post post = new Post(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getDate("creation_date"),
                rs.getDate("LastEdit_date"),
                rs.getInt("user_id"));

        return post;
    };

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Optional<List<Post>> getAllPost(User user) {

        String sqlQuery = "select * from users where username=? and password=?";

        return Optional.empty();

    }
}
