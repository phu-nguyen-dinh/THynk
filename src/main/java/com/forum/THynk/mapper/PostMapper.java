package com.forum.THynk.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.forum.THynk.dto.req.PostRequestDTO;
import com.forum.THynk.dto.res.PostResponseDTO;
import com.forum.THynk.entity.Post;

@Component
public class PostMapper {
    public Post toEntity(PostRequestDTO dto) {
        if(dto == null) {
            return null;
        }
        Post post = new Post();
        post.setContent(dto.getContent());
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());

        return post;
    }

    public PostResponseDTO toResponseDTO(Post post) {
        if(post == null) {
            return null;
        }
        PostResponseDTO dto = new PostResponseDTO();
        dto.setPostId(post.getId());
        dto.setContent(post.getContent());
        dto.setThreadId(post.getThread().getId());
        dto.setCreatedByUserId(post.getCreatedBy().getId());
        dto.setCreatedByUsername(post.getCreatedBy().getUsername());
        dto.setCreatedAt(post.getCreatedAt());
        dto.setUpdatedAt(post.getUpdatedAt());
        dto.setParentPostId(post.getParentPost() != null ? post.getParentPost().getId() : null);
        dto.setLikeCount(0);

        return dto;
    }
}
