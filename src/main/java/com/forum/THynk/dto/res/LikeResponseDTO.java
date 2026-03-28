package com.forum.THynk.dto.res;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class LikeResponseDTO {
    private Long likeId;
    private Long userId;
    private Long postId;
    private LocalDateTime createdAt;
}
