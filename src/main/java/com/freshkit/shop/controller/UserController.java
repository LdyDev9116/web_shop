package com.freshkit.shop.controller;


import com.freshkit.shop.dto.ProductDto;
import com.freshkit.shop.dto.UserDTO;
import com.freshkit.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Controller
@Log4j2
@RequiredArgsConstructor
public class UserController {



    private final UserService userService;
    //shop-catalog
    @GetMapping("/index")
    public String a33333aa() {
//        return "signup";
        log.info("========================회원가입");
        return "index";
    }
 //shop-catalog
 @GetMapping("/shop-catalog")
 public String catalog22222() {
//        return "signup";
     log.info("========================회원가입");
     return "shop-catalog";
 }
    @GetMapping("/ex/signup")
    public String signupForm() {
//        return "signup";
        log.info("========================회원가입");
        return "ex/signup";
    }

    @PostMapping("/insertUser")
    public String insertUser(@ModelAttribute UserDTO userDTO) {
        userService.insertUser(userDTO);
        return "redirect:/ex/login"; // 사용자 데이터 저장 후 로그인 페이지로 리다이렉트
    }

    @GetMapping("/ex/login")
    public String loginForm() {
//        return "signup";
        return "ex/login";
    }

}