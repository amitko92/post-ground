package com.post.ground.post.ground.repositories.posts;

import models.Post;
import models.User;

import java.util.List;
import java.util.Optional;

public interface PostsRepository {

    public Optional<List<Post>> getAllPost(User user);
}
