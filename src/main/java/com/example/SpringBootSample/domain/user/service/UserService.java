package com.example.SpringBootSample.domain.user.service;

import java.util.List;

import com.example.SpringBootSample.domain.user.model.MUser;

public interface UserService {

    /**Register user**/
    public void signup(MUser user);

    /** get user **/
    public List<MUser> getUsers(MUser user);

    /**get user(one)**/
    public MUser getUserOne(String userId);

    /**update user(one)**/
    public void updateUserOne(String userId,
                              String password,
                              String userName);
    /**delete user(one)**/
    public void deleteUserOne(String userId);

}
