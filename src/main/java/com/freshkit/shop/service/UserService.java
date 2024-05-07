package com.freshkit.shop.service;


import com.freshkit.shop.dto.ProductDto;
import com.freshkit.shop.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.freshkit.shop.dto.UserDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public void register(UserDTO userdto) {
        userMapper.insertUser(userdto);
    }

    public void insertUser(UserDTO userdto) {
        userMapper.insertUser(userdto);
    }
}