package com.forum.THynk.dto.res;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PostResponseDTO {
    private Long postId;
    private Long threadId;
    private String content;
    private Long parentPostId;
    private Long createdByUserId;
    private String createdByUsername;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer likeCount;
}
