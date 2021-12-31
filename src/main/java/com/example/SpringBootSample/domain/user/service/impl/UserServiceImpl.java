package com.example.SpringBootSample.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootSample.domain.user.model.MUser;
import com.example.SpringBootSample.domain.user.service.UserService;
import com.example.SpringBootSample.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    /**Register user **/
    @Override
    public void signup(MUser user){
        user.setDepartmentId(1); //department
        user.setRole("ROLE_GENERAL"); //role
        mapper.insertOne(user);
    }

    @Override
    public List<MUser> getUsers(){
        return mapper.findMany();
    }

    /**get user (one)**/
    @Override
    public MUser getUserOne(String userId){
        return mapper.findOne(userId);
    }

    /**update user(one)**/
    @Override
    public void updateUserOne(String userId,
                              String password,
                              String userName){
        mapper.updateOne(userId, password, userName);
    }

    /**delete user(one)**/
    @Override
    public void deleteUserOne(String userId){
        int count = mapper.deleteOne(userId);
    }
}
