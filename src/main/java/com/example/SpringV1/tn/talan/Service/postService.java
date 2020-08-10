package com.example.SpringV1.tn.talan.Service;

import com.example.SpringV1.tn.talan.Dto.PostDto;
import com.example.SpringV1.tn.talan.Entity.Post;

import java.util.List;

public interface postService {
    PostDto createPost(PostDto postDto);

    PostDto updatePost(PostDto postDto);

    PostDto getPostById(Long id);

    List<Post> getAllPost();

    void deletePost(Long id);

    int like(PostDto postDto);

   List<Post> getAllByCategoryId(long id);

}
