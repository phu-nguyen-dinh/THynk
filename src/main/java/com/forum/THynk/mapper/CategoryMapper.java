package com.forum.THynk.mapper;

import org.springframework.stereotype.Component;

import com.forum.THynk.dto.req.CategoryRequestDTO;
import com.forum.THynk.dto.res.CategoryResponseDTO;
import com.forum.THynk.entity.Category;

@Component
public class CategoryMapper {
    public Category toEntity(CategoryRequestDTO dto) {
        if(dto == null) {
            return null;
        }
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        category.setOrder(dto.getOrder());
        category.setParentId(dto.getParentId());

        return category;
    }

    public CategoryResponseDTO toResponseDTO(Category category) {
        if(category == null) {
            return null;
        }
        CategoryResponseDTO dto = new CategoryResponseDTO();
        dto.setCategoryId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        dto.setOrder(category.getOrder());
        dto.setParentId(category.getParentId());

        return dto;
    }
}
