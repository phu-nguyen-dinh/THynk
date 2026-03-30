package com.forum.THynk.service;

import com.forum.THynk.dto.req.UserRequestDTO;
import com.forum.THynk.dto.res.UserResponseDTO;

public interface UserService {
    UserResponseDTO CreateUser(UserRequestDTO request);
    UserResponseDTO GetUserById(Long id);
    UserResponseDTO UpdateUser(Long id, UserRequestDTO request);
    void DeleteUser(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
