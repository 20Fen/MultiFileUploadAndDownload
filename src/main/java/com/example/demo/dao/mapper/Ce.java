package com.example.demo.dao.mapper;

import com.example.demo.po.Ceshi;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description:
 *
 * @author yangfl
 * @date 2019年10月09日 15:37
 * Version 1.0
 */
@Mapper
@Component
public interface Ce {
    List<Ceshi> findAll();
}
