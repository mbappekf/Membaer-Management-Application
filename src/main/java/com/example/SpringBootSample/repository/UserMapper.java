package com.example.SpringBootSample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.SpringBootSample.domain.user.model.MUser;


@Mapper
public interface UserMapper {
    /**register user**/
    public int insertOne(MUser user);

    /**get user**/
    public List<MUser> findMany(MUser user);

    /**get user(one)**/
    public MUser findOne(String userId);

    /**update user(one)**/
    public void updateOne(@Param("userId") String userId,
                          @Param("password") String password,
                          @Param("userName") String userName);
    /**delete user(one)**/
    public int deleteOne(@Param("userId") String userId);
}
