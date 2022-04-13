package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.CategoryCopy1Entity;
import com.atguigu.gulimall.product.service.CategoryCopy1Service;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;
import javax.annotation.Resource;



/**
 * 商品三级分类
 *
 * @author peekaboo
 * @email zxc2399897@vip.qq.com
 * @date 2022-04-13 14:41:41
 */
@RestController
@RequestMapping("product/categorycopy1")
public class CategoryCopy1Controller {
    @Resource
    private CategoryCopy1Service categoryCopy1Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:categorycopy1:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryCopy1Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:categorycopy1:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryCopy1Entity categoryCopy1 = categoryCopy1Service.getById(catId);

        return R.ok().put("categoryCopy1", categoryCopy1);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:categorycopy1:save")
    public R save(@RequestBody CategoryCopy1Entity categoryCopy1){
		categoryCopy1Service.save(categoryCopy1);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:categorycopy1:update")
    public R update(@RequestBody CategoryCopy1Entity categoryCopy1){
		categoryCopy1Service.updateById(categoryCopy1);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:categorycopy1:delete")
    public R delete(@RequestBody Long[] catIds){
		categoryCopy1Service.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
