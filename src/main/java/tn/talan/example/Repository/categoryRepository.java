package tn.talan.example.Repository;

import tn.talan.example.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepository extends JpaRepository<Category, Long> {

}
