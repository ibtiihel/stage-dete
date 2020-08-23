package tn.talan.example.Repository;


import tn.talan.example.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface postRepository extends JpaRepository<Post, Long> {
    List<Post> getAllByCategory_Id(long id);

}
