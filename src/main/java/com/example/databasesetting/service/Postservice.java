package com.example.databasesetting.service;

import com.example.databasesetting.mapper.PostMapper;
import com.example.databasesetting.model.Post;
import com.example.databasesetting.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service  // 스프링부트가 로드 될 때 포스트 서비스라는 클래스를 빈으로 주입을 해준다.
@RequiredArgsConstructor
public class Postservice {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public List<Post> postList(String title) {
//        return postRepository.findByTitle(title);
        return  postRepository.findByTitleContains(title);
//        return postMapper.listPost();
    }

/*    @Autowired
    public Postservice(PostRepository postRepository){
        this.postRepository = postRepository;
    }*/
}
