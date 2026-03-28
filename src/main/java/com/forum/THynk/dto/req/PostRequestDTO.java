package com.forum.THynk.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PostRequestDTO {
    @NotNull
    private Long threadId;

    @NotBlank
    private String content;
    
    private Long parentPostId;
}
