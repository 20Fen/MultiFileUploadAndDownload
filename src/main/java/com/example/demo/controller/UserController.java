package com.example.demo.controller;

import com.example.demo.dao.mapper.Ce;
import com.example.demo.dao.mapper.User;
import com.example.demo.po.Ceshi;
import com.example.demo.po.UserC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    private Ce ce;
    @Autowired
    private User user;

    @RequestMapping("primary")
    public Object primary(){
        List<Ceshi> list = ce.findAll();
        return list;
    }

    @RequestMapping("secondary")
    public Object secondary(){
        System.out.println();
        List<UserC> list = user.findAll();
        return list;
    }
}
