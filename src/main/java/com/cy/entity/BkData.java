package com.cy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: 𝓛.𝓕.𝓠
 */
@TableName("lfq_crawl_data")
//@KeySequence("SEQ_LFQ_CRAWL")
@Data
public class BkData {
    @TableId(value = "id")
    private int id;
    @TableField("jg_name")
    private String jgName;
    private int ryjl;//日邮件量
    private double rsr;//日收入
    private int yyjl;//月邮件量
    private double ysr;//月收入
}
