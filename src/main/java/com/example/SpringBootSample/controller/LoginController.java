package com.example.SpringBootSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    /**login画面の作成**/
    @GetMapping("/login")
    public String getLogin(){
        return "login/login";
    }

    /**user一覧画面にリダイレクト*/
    @PostMapping("/login")
    public String postLogin(){
        return "redirect:/user/list";
    }
}
