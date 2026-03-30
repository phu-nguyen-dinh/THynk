package com.forum.THynk.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.forum.THynk.dto.req.ThreadRequestDTO;
import com.forum.THynk.dto.res.ThreadResponseDTO;

public interface ThreadService {
    ThreadResponseDTO CreateThread(ThreadRequestDTO request);
    Page<ThreadResponseDTO> GetAllThreads();
    ThreadResponseDTO GetThreadById(Long id);
    Page<ThreadResponseDTO> GetThreadsByCategoryId(Long categoryId, Pageable pageable);
    Page<ThreadResponseDTO> searchThreads(String keyword, Pageable pageable);
    void incrementViewCount(Long id);
    void LockThread(Long threadId, Long userId);
    void pinThread(Long threadId, Long userId);
}
