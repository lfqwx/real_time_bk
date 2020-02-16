package com.cy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.entity.Login;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public interface LoginMapper extends BaseMapper<Login> {
    @Select({"select * from login limit}"})
    List<Login> find();
}

