package com.job.service;

import com.job.model.CreatePost;
import com.job.repository.CreatePostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bappy on 5/14/17.
 */
@Service
public class CreatePostServiceImpl implements CreatePostService {


    private CreatePostRepository createPostRepository;

    @Autowired
    public void setCreatePostRepository(CreatePostRepository createPostRepository) {
        this.createPostRepository = createPostRepository;
    }


    @Override
    public Iterable<CreatePost> listAllProducts() {
        return createPostRepository.findAll();
    }

    @Override
    public CreatePost getCreatePostById(Integer id) {
        return createPostRepository.findOne(id);
    }

    @Override
    public CreatePost saveCreatePost(CreatePost createPost) {
        return createPostRepository.save(createPost);
    }

    @Override
    public void deleteCreatePost(Integer id) {
        createPostRepository.delete(id);
    }


}
