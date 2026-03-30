package com.forum.THynk.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.forum.THynk.dto.req.PostRequestDTO;
import com.forum.THynk.dto.res.PostResponseDTO;

import jakarta.persistence.PostRemove;

public interface PostService {
    PostRemove createPost(PostRequestDTO request, Long currentUserId);
    Page<PostResponseDTO> getPostsByThread(Long threadId, Pageable pageable);
    List<PostResponseDTO> getRepliesByPost(Long postId);
    PostResponseDTO getPostById(Long postId);
    PostResponseDTO updatePost(Long postId, String newContent, Long currentUserId);
    void deletePost(Long postId, Long currentUserId);
}
