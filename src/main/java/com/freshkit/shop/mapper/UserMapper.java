package com.freshkit.shop.mapper;

//import com.ssg.wsmt.smOrders.domain.SmOrdersVo;
//
//import com.ssg.wsmt.smOrders.domain.SmOrdersVo;
//import com.ssg.wsmt.smOrders.dto.SmOrdersDTO;
//import com.ssg.wsmt.smOrders.enums.SellerSendStatus;
import com.freshkit.shop.dto.ItemDto;
import com.freshkit.shop.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface UserMapper {
        void register(UserDTO userdto);

        void insertUser(UserDTO userdto);
}