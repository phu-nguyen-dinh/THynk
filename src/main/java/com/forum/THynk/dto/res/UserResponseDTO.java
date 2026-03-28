package com.forum.THynk.dto.res;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private Integer reputation;
    private String role;
    private LocalDateTime createdAt;
}
