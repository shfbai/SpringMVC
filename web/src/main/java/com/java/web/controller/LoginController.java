package com.java.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bai on 2018/3/7.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {
        return "index.jsp";
    }
}
