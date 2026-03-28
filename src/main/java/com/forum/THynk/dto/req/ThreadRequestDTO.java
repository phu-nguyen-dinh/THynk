package com.forum.THynk.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ThreadRequestDTO {
    @NotBlank
    private String title;

    @NotNull
    private Integer categoryId;
}
