package com.cy;

import com.cy.entity.BkData;
import com.cy.mapper.BkMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public class MyTest extends ApplicationTests {
    @Autowired
    private BkMapper bkMapper;

    @Test
    public void bkTest(){
        List<BkData> list = bkMapper.findAll();
        System.out.println(list.size());
    }
}
