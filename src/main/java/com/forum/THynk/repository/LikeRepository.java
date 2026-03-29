package com.forum.THynk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.forum.THynk.entity.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByUser_UserIdAndPost_PostId(Long userId, Long postId);
    boolean existsByUser_UserIdAndPost_PostId(Long userId, Long postId);

    // Đếm số lượng like của một post
    @Query("SELECT COUNT(l) FROM Like l WHERE l.post.Id = :postId")
    Long countByPost_PostId(@Param("postId") Long postId);

    // Lấy danh sách user đã like của một post
    List<Like> findByPost_PostId(Long postId);
    
    // unlike (xóa like)
    void deleteByUser_UserIdAndPost_PostId(Long userId, Long postId);
}
