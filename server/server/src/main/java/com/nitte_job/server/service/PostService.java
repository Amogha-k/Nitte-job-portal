package com.nitte_job.server.service;

import com.nitte_job.server.dto.PostDTO;
import com.nitte_job.server.model.PostModel;

import java.util.List;

public interface PostService {

    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}