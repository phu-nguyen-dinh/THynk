package com.forum.THynk.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "threads")
public class Thread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "last_post_at")
    private LocalDateTime lastPostAt;

    @Column(name = "view_count")
    private Long viewCount;

    @Column(name = "is_locked")
    private boolean isLocked;

    @Column(name = "is_pinned")
    private boolean isPinned;
}
