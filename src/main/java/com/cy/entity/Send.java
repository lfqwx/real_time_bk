package com.cy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: 𝓛.𝓕.𝓠
 */
@TableName("lfq_send_data")
//@KeySequence("SEQ_LFQ_CRAWL")
@Data
public class Send {
    @TableField("jg_name")
    private String jgName;
    private int jhrywl;
    private int jhrsr;
    private int ryjl;//日邮件量
    private double rsr;//日收入
    private int rmbywl;//月邮件量

}
