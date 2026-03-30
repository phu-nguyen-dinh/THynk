package com.forum.THynk.service;

import java.util.List;

import com.forum.THynk.dto.req.CategoryRequestDTO;
import com.forum.THynk.dto.res.CategoryResponseDTO;

public interface CategoryService {
    CategoryResponseDTO CreateCategory(CategoryRequestDTO request);
    List<CategoryResponseDTO> GetAllCategories();
    CategoryResponseDTO GetCategoryById(Long id);
    CategoryResponseDTO UpdateCategory(Long id, CategoryRequestDTO request);
    void DeleteCategory(Long id);
}
