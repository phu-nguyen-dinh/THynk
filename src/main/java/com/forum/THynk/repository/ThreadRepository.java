package com.forum.THynk.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forum.THynk.entity.Thread;

@Repository
public interface ThreadRepository extends JpaRepository<Thread, Long> {
    // lấy danh sách thread theo category (có phân trang)
    Page<Thread> findByCategory_CategoryIdOrderByIsPinnedDescLastPostAtDesc(Long categoryId, Pageable pageable);
    
    // lấy danh sách tất cả thread (trang chủ)
    Page<Thread> findAllByOrderByIsPinnedDescLastPostAtDesc(Pageable pageable);

    // Tìm thread theo từ khóa trong title
    Page<Thread> findByTitleContainingIgnoreCaseOrderByLastPostAtDesc(String keyword, Pageable pageable);

    // Đếm số lượng thread trong một category
    Long countByCategory_CategoryId(Long categoryId);

    // Lấy danh sách thread đã được ghim
    List<Thread> findByIsPinnedTrueOrderByLastPostAtDesc();
}
