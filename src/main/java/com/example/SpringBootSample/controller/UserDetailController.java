package com.example.SpringBootSample.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootSample.domain.user.model.MUser;
import com.example.SpringBootSample.domain.user.service.UserService;
import com.example.SpringBootSample.form.UserDetailForm;


@Controller
@RequestMapping("/user")
public class UserDetailController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    /**describe user's detail**/
    @GetMapping("/detail/{userId:.+}")
    public String getUser(UserDetailForm form, Model model,
                          @PathVariable("userId") String userId){
        //get user (one)
        MUser user = userService.getUserOne(userId);
        user.setPassword(null);

        //convert MUser to form
        form = modelMapper.map(user, UserDetailForm.class);

        //Register to Model
        model.addAttribute("userDetailForm", form);

        //describe user's detail
        return "user/detail";
    }

    /**update user**/
    @PostMapping(value="/detail", params="update")
    public String updateUser(UserDetailForm form, Model model){

        //update user
        userService.updateUserOne(form.getUserId(),
                form.getPassword(),
                form.getUserName());

        //redirect to user table
        return "redirect:/user/list";
    }

    /**delete user**/
    @PostMapping(value="/detail", params="delete")
    public String deleteUser(UserDetailForm form, Model model){

        //delete user
        userService.deleteUserOne(form.getUserId());

        //redirect to user table
        return "redirect:/user/list";
    }
}
