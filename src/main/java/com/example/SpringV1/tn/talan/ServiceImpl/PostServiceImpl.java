package com.example.SpringV1.tn.talan.ServiceImpl;
import com.example.SpringV1.tn.talan.Dto.PostDto;
import com.example.SpringV1.tn.talan.Helper.ModelMapperConverter;
import com.example.SpringV1.tn.talan.Service.postService;
import com.example.SpringV1.tn.talan.Entity.Post;
import com.example.SpringV1.tn.talan.Repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostServiceImpl implements postService{


        @Autowired
        private postRepository postRepository;
        @Autowired
        private ModelMapperConverter modelMapperConverter;

        @Override
        public PostDto createPost(PostDto postDto)
        {
            Post post = modelMapperConverter.convert(postDto,Post.class);
             this.postRepository.save(post);
             return postDto;
        }

        @Override
        public PostDto updatePost(PostDto postDto) {
            Post post = modelMapperConverter.convert(postDto,Post.class);
             this.postRepository.save(post);
            return postDto;

        }

        @Override
        public List<Post> getAllPost() {

            return this.postRepository.findAll();
        }

        @Override
        public PostDto getPostById(Long id)
        {
            Post post = this.postRepository.findById(id).get();
            return modelMapperConverter.convert(post,PostDto.class);
        }

        @Override
        public void deletePost(Long id) {
            this.postRepository.deleteById(id);
        }

        @Override
       public int like(PostDto postDto){
            Optional<Post> postDb = postRepository.findById(postDto.getPostId());
            int likes = postDb.get().getNbreLike() + 1;
            postDb.get().setNbreLike(likes);
            this.postRepository.save(postDb.get());
             return likes;

        }

    @Override
    public List<Post> getAllByCategoryId(long id){

        return this.postRepository.getAllByCategory_Id(id);

    }
    }
