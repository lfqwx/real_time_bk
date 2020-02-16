package com.cy.config;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

import static com.cy.config.DruidDataSource.getSqlSessionFactory;

@Configuration
//如此:不需要在没个实体类上注解
@MapperScan(basePackages="com.cy.mapper")
public class ThirdConfig {

    @Bean(name = "thirdSqlSessionFactory")
    public SqlSessionFactory primarySqlSessionFactory(@Qualifier("thirdDataSource") DataSource dataSource,GlobalConfig globalConfiguration) throws Exception {
        return getSqlSessionFactory(dataSource, globalConfiguration);
    }

    @Bean(name = "thirdTransactionManager")
    public DataSourceTransactionManager primaryTransactionManager(@Qualifier("thirdDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "thirdSqlSessionTemplate")
    public SqlSessionTemplate primarySqlSessionTemplate(@Qualifier("thirdSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
