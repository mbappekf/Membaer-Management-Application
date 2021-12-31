package com.example.SpringBootSample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootSample.domain.user.model.MUser;
import com.example.SpringBootSample.domain.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserListController {

    @Autowired
    private UserService userService;

    /**user一覧画面を表示*/
    @GetMapping("/list")
    public String getUserList(Model model){
        //get user table
        List<MUser> userList = userService.getUsers();

        //Register to Model
        model.addAttribute("userList",userList);

        //user一覧画面を表示
        return "user/list";
    }
}
