package com.example.databasesetting.mapper;

import com.example.databasesetting.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // JPA는 findAll() 자동으로 지정해주지만 mybatis는 직접 지정해줘야한다.
public interface PostMapper {
    public List<Post> listPost();
}
