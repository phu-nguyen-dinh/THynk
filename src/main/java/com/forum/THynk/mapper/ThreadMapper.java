package com.forum.THynk.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.forum.THynk.dto.req.ThreadRequestDTO;
import com.forum.THynk.dto.res.ThreadResponseDTO;
import com.forum.THynk.entity.Thread;

@Component
public class ThreadMapper {
    public Thread toEntity(ThreadRequestDTO dto) {
        if(dto == null) {
            return null;
        }
        Thread thread = new Thread();
        thread.setTitle(dto.getTitle());
        thread.setCreatedAt(LocalDateTime.now());
        thread.setLastPostAt(LocalDateTime.now());
        thread.setViewCount(0);
        thread.setIsLocked(false);
        thread.setIsPinned(false);

        return thread;
    }

    public ThreadResponseDTO toResponseDTO(Thread thread) {
        if(thread == null) {
            return null;
        }
        ThreadResponseDTO dto = new ThreadResponseDTO();
        dto.setThreadId(thread.getId());
        dto.setTitle(thread.getTitle());
        dto.setCategoryId(thread.getId());
        dto.setCategoryName(thread.getCategory().getName());
        dto.setCreatedByUserId(thread.getCreatedBy().getId());
        dto.setCreatedByUsername(thread.getCreatedBy().getUsername());
        dto.setCreatedAt(thread.getCreatedAt());
        dto.setLastPostAt(thread.getLastPostAt());
        dto.setViewCount(thread.getViewCount());
        dto.setIsLocked(thread.getIsLocked());
        dto.setIsPinned(thread.getIsPinned());
        dto.setPostCount(thread.getPosts() != null? thread.getPosts().size() : 0);

        return dto;
    }
}
