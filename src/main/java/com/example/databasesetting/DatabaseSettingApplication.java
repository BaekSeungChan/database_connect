package com.example.databasesetting;

import com.example.databasesetting.model.Post;
import com.example.databasesetting.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseSettingApplication implements CommandLineRunner {

    private final PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseSettingApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception { // 초기 데이터 세팅 방법
        List<Post> postList = List.of(
                new Post(UUID.randomUUID(), "title1", "contents1", "chan", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2", "contents2", "baek", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title3", "contents3", "seung", LocalDateTime.now())
        );

        postRepository.saveAll(postList);
    }
}
