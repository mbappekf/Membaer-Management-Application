package com.example.SpringBootSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    /**index画面の作成**/
    @GetMapping("/")
    public String getIndex(){
        return "/index";
    }

    /**login画面にリダイレクト**/
    @PostMapping("/")
    public String postIndex(){
        return "redirect:/login";
    }
}
