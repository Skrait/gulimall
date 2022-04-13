package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryCopy1Dao;
import com.atguigu.gulimall.product.entity.CategoryCopy1Entity;
import com.atguigu.gulimall.product.service.CategoryCopy1Service;


@Service("categoryCopy1Service")
public class CategoryCopy1ServiceImpl extends ServiceImpl<CategoryCopy1Dao, CategoryCopy1Entity> implements CategoryCopy1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryCopy1Entity> page = this.page(
                new Query<CategoryCopy1Entity>().getPage(params),
                new QueryWrapper<CategoryCopy1Entity>()
        );

        return new PageUtils(page);
    }

}