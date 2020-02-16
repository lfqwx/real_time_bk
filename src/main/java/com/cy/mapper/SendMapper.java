package com.cy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.entity.Send;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public interface SendMapper extends BaseMapper<Send> {
    @Select({"select * from lfq_send_data"})
    List<Send> findAll();
}