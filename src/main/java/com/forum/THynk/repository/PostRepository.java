package com.forum.THynk.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.forum.THynk.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Lấy tất cả các post trong một thread (theo thứ tự thời gian tạo)
    Page<Post> findByThread_ThreadIdOrderByCreatedAtAsc(Long threadId, Pageable pageable);

    // Lấy tất cả các post trong một thread, chỉ lấy post gốc (không lấy reply)
    List<Post> findByThread_ThreadIdAndParentPostIsNullOrderByCreatedAtAsc(Long threadId);

    // Đếm số lượng post trong một thread
    Long countByThread_ThreadId(Long threadId);

    // Tìm các reply của một post
    List<Post> findByParentPost_PostIdOrderByCreatedAtAsc(Long parentPostId);

    // Lấy post đầu tiên của thread (post gốc)
    @Query("SELECT p FROM Post p WHERE p.thread.Id = :threadId AND p.parentPost IS NULL ORDER BY p.createdAt ASC LIMIT 1")
    Post findFirstPostByThreadId(@Param("threadId") Long threadId);
}
