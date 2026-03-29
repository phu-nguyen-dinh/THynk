package com.forum.THynk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.forum.THynk.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByParentIdIsNullOrderByNameAsc();
    List<Category> findByParentIdOrderByOrderAsc(Long parentId);
    
    // Tìm tất cả category theo thứ tự
    @Query("SELECT c FROM Category c ORDER BY c.id ASC, c.order ASC")
    List<Category> findAllOrdered();
}
