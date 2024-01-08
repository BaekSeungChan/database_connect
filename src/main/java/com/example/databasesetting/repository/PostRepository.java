package com.example.databasesetting.repository;

import com.example.databasesetting.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// JpaRepository : select, update, delete 이런 메서드를 기본적으로 제공해준다.
// @Repository : 원래는 설정해주지만 상속받으면 생략해줘도 된다.
public interface PostRepository extends JpaRepository<Post, UUID> {
}
