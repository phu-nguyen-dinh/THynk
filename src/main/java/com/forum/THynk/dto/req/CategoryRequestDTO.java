package com.forum.THynk.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryRequestDTO {
    @NotBlank
    private String name;

    private String description;

    private Integer order;

    private Long parentId;
}
