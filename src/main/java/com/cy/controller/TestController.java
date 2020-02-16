package com.cy.controller;

import com.cy.mapper.BkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 𝓛.𝓕.𝓠
 */
@Controller
public class TestController {
    @Autowired
    private BkMapper bkMapper;

    @GetMapping("/bk")
    @ResponseBody
    public List bk() {
        return bkMapper.findAll();
    }
}
