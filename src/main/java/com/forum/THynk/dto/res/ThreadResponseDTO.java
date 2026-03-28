package com.forum.THynk.dto.res;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ThreadResponseDTO {
    private Long id;
    private String title;
    private Long categoryId;
    private String categoryName;
    private Long createdByUserId;
    private String createdByUsername;   
    private LocalDateTime createdAt;
    private LocalDateTime lastPostAt;
    private Integer viewCount;
    private Boolean isLocked;
    private Boolean isPinned;
    private Integer postCount;
}
