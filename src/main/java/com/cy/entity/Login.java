package com.cy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: 𝓛.𝓕.𝓠
 */
@TableName("login")
//@KeySequence("SEQ_LFQ_CRAWL")
@Data
public class Login {
    private String xm;
    private String name;
    private String password;
}
