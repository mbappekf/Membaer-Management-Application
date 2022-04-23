package com.example.SpringBootSample.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootSample.domain.user.model.MUser;
import com.example.SpringBootSample.domain.user.service.UserService;
import com.example.SpringBootSample.form.UserListForm;


@Controller
@RequestMapping("/user")
public class UserListController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    /**user一覧画面を表示*/
    @GetMapping("/list")
    public String getUserList(@ModelAttribute UserListForm form, Model model){
        //formをuserクラスに変換
        MUser user =modelMapper.map(form, MUser.class);

        //searching user
        List<MUser> userList = userService.getUsers(user);

        //Register to Model
        model.addAttribute("userList",userList);

        //user一覧画面を表示
        return "user/list";
    }

    //user検索処理
    @PostMapping("/list")
    public String postUserList(@ModelAttribute UserListForm form, Model model){
        //form をMUserクラスに変換
        MUser user = modelMapper.map(form, MUser.class);

        //user検索
        List<MUser>userList = userService.getUsers(user);

        //Modelに登録
        model.addAttribute("userList", userList);

        //user一覧画面を表示
        return "user/detail";
    }
}
