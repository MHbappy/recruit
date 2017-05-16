package com.job.service;


import com.job.model.CreatePost;

public interface CreatePostService {

    Iterable<CreatePost> listAllProducts();

    CreatePost getCreatePostById(Integer id);

    CreatePost saveCreatePost(CreatePost createPost);

    void deleteCreatePost(Integer id);

}
