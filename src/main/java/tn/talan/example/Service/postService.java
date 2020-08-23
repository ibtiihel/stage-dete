package tn.talan.example.Service;

import tn.talan.example.Dto.PostDto;
import tn.talan.example.Entity.Post;

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
