package com.example.SpringV1.tn.talan.Repository;


import com.example.SpringV1.tn.talan.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface postRepository extends JpaRepository<Post, Long> {
    List<Post> getAllByCategory_Id(long id);

}
