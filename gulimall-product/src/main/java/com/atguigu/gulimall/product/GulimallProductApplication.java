package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合MybatisPlus
 *  1)、导入依赖
 *  2)、配置
 *   1、配置数据源
 *    1)、导入数据库的驱动
 *    2)、在application.yml里配置数据源信息
 *   2、配置MyBatis-Plus
 *    1)、使用@MapperScan告诉MP Mapper接口位置
 *    2)、告诉MyBatis-Plus，sql映射文件即XML
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
