package com.forum.THynk.dto.res;

import lombok.Data;

@Data
public class CategoryResponseDTO {
    private Long id;
    private String name;
    private String description;
    private Integer order;
    private Long parentId;
}
