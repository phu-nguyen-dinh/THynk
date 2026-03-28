package com.forum.THynk.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryRequest {
    @NotBlank
    private String name;

    private String description;

    private Integer order;

    private Long parentId;
}
