package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryCopy1Entity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author peekaboo
 * @email zxc2399897@vip.qq.com
 * @date 2022-04-13 14:41:41
 */
public interface CategoryCopy1Service extends IService<CategoryCopy1Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

