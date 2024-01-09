package com.example.databasesetting.controller;

import com.example.databasesetting.model.Post;
import com.example.databasesetting.service.Postservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor // 생성자 주입을 할 수 있게 롬복이 알아서 만들어준다.
@RequestMapping("/posts")
public class PostController {

    private final Postservice postservice;

/*    @Autowired
    public PostController(Postservice postservice){
        this.postservice = postservice;
    }*/ // 요새는 생성자 주입을 Autowired -> RequiredArgsConstructor로 많이 사용한다.


    @GetMapping("/list")
    public List<Post> postList(@RequestParam String title){
        return postservice.postList(title);
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now());
    }
}
