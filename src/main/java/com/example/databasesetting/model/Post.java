package com.example.databasesetting.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post {
    @Id  // 데이터베이스를 필수적으로 PK를 설정해줘야한다.
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;
}
