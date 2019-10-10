package com.example.demo.po;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Description:
 *
 * @author yangfl
 * @date 2019年10月09日 15:31
 * Version 1.0
 */
@Data
@ApiModel(value = "条件查询model")
public class UserC {

    private String id;
    private String name;
    private String year;
}
