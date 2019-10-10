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
 *
 * @author yangfl
 * @date 2019年10月09日 15:46
 * Version 1.0
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
