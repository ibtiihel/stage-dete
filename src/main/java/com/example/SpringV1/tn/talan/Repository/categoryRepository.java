package com.example.SpringV1.tn.talan.Repository;

import com.example.SpringV1.tn.talan.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepository extends JpaRepository<Category, Long> {

}
