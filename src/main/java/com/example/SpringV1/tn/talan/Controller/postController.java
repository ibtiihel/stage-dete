package com.example.SpringV1.tn.talan.Controller;
import com.example.SpringV1.tn.talan.Dto.PostDto;
import com.example.SpringV1.tn.talan.Repository.postRepository;
import com.example.SpringV1.tn.talan.Entity.Post;
import com.example.SpringV1.tn.talan.Service.postService;
import com.example.SpringV1.tn.talan.ServiceImpl.PostServiceImpl;
import org.modelmapper.ModelMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class postController {
    @Autowired
    private postService postService;

    public postController() {
    }

    @GetMapping
    public List<Post> getAllPost(){ return this.postService.getAllPost();}


    @GetMapping("{id}")
    public PostDto getPostById(@PathVariable Long id){return this.postService.getPostById(id);}

    @PostMapping
    public PostDto createPost(@RequestBody PostDto postDto){ return this.postService.createPost(postDto);}

    @PutMapping
    public PostDto updatePost(@RequestBody PostDto postDto){ return this.postService.updatePost(postDto);}

    @DeleteMapping("{id}")
    public HttpStatus deletePost(@PathVariable Long id){
        this.postService.deletePost(id);
        return HttpStatus.OK;
    }


}
