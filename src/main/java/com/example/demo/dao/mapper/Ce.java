package com.example.demo.dao.mapper;

import com.example.demo.po.Ceshi;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description:mapper接口
 */
@Mapper
@Component
public interface Ce {
    List<Ceshi> findAll();
}
