package com.viber_bot.car_sharing.controller;

import com.viber_bot.car_sharing.model.User;
import com.viber_bot.car_sharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
public class WebController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAllUsers(Model model){
        List<User> uList = new ArrayList<>();
        uList = userService.findAll();
        model.addAttribute("users", uList);
        return "users";
    }
}
