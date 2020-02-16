package com.cy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cy.entity.BkData;
import com.cy.entity.Send;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public interface SendMapper extends BaseMapper<Send> {
    @Insert({"insert into jjr_info(yjhm,jjr,jjrdz,jjrdh,rq) values(#{yjhm},#{jjr},#{jjrdz},#{jjrdh},#{rq})"})
    int insert(BkData data);

    //只写邮件号
    @Insert({"insert into jjr_info(yjhm) values(#{yjhm})"})
    int insertYjhm(BkData data);
    //分页
    @Select({"select * from jjr_info limit #{pageNo},#{limitNo}"})
    List<BkData> findPages(@Param("pageNo") int pageNo, @Param("limitNo") int limitNo);

    //查找全部
    @Select({"select * from jjr_info"})
    List<BkData> findAll();

    //精确查找
    @Select("<script>select * from jjr_info where 1=1" +
            " <if test='yjhm != null'>and yjhm = #{yjhm}</if>" +
            "<if test='start != null'>and rq &gt;=#{start}</if>" +
            "<if test='end != null'>and rq &lt;= #{end}</if> limit #{pageNo},#{limitNo}</script>")
    List<BkData> find(@Param("yjhm") String yjhm, @Param("start") Date start, @Param("end") Date end, @Param("pageNo") int pageNo, @Param("limitNo") int limitNo);

    @Select("<script>select * from jjr_info where 1=1 " +
            "<if test='yjhm != null'>and yjhm = #{yjhm}</if>" +
            "<if test='start != null'>and rq &gt;=#{start}</if>" +
            "<if test='end != null'>and rq &lt;= #{end}</if></script>")
    List<BkData> findBy(@Param("yjhm") String yjhm, @Param("start") Date start, @Param("end") Date end);
}
