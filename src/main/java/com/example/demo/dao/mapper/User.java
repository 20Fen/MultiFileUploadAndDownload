package com.example.demo.dao.mapper;

import com.example.demo.po.UserC;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description mapper接口
 * @author Y
 * @Param [ null ]
 * @return
 * @date 2019/10/10 9:14
 */
@Component
@Mapper
public interface User {
    List<UserC> findAll();
}
