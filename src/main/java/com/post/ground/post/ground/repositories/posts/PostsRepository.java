package com.post.ground.post.ground.repositories.posts;

import models.Post;
import models.User;

import java.util.List;
import java.util.Optional;

public interface PostsRepository {

    /**
     * get all post of given User, search by UserId.
     * @param user
     * @return list of all user's posts.
     */
    public Optional<List<Post>> getAllPost(User user);
}
