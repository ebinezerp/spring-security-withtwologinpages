package com.example.springsecurity.withtwologinpages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/userlogin")
    public String userLogin(){
        return "userlogin";
    }

    @GetMapping("/adminlogin")
    public String adminLogin(){
        return "adminlogin";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/admin/home")
    public String adminHome(){
        return "adminhome";
    }

    @GetMapping("/user/home")
    public String userHome(){
        return "userhome";
    }

    @GetMapping("/admin/contact")
    public String adminContact(){
        return "admincontact";
    }

    @GetMapping("/user/contact")
    public String userContact(){
        return "usercontact";
    }

    @GetMapping("/common")
    public String commonPage(){
        return "common";
    }

    @GetMapping("/userAccessDenied")
    public String userAccessDenied(){
        return "userlogin";
    }

    @GetMapping("/adminAccessDenied")
    public String adminAccessDenied(){
        return "adminlogin";
    }
}
