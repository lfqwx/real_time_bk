package com.cy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.entity.BkData;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public interface BkMapper extends BaseMapper<BkData> {
    @Select({"select * from lfq_crawl_data"})
    List<BkData> findAll();
}