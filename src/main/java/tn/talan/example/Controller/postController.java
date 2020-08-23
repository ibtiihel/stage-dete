package tn.talan.example.Controller;
import tn.talan.example.Dto.PostDto;
import tn.talan.example.Entity.Post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class postController {
    @Autowired
    private tn.talan.example.Service.postService postService;

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
