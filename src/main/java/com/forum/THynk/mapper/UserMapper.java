package com.forum.THynk.mapper;

import java.time.LocalDateTime;

import com.forum.THynk.dto.req.UserRequestDTO;
import com.forum.THynk.dto.res.UserResponseDTO;
import com.forum.THynk.entity.User;
import com.forum.THynk.enums.Role;

public class UserMapper {
    public User toEntity(UserRequestDTO dto) {
        if(dto == null) {
            return null;
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setFullName(dto.getFullName());
        user.setCreatedAt(LocalDateTime.now());
        user.setReputation(0);
        user.setRole(Role.USER); // Mặc định role là USER
        return user;
    }

    public UserResponseDTO toResponseDTO(User user) {
        if(user == null) {
            return null;
        }

        UserResponseDTO dto = new UserResponseDTO();
        dto.setUserId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setFullName(user.getFullName());
        dto.setCreatedAt(user.getCreatedAt());
        dto.setReputation(user.getReputation());
        dto.setRole(user.getRole().toString());
        return dto;
    }
}
