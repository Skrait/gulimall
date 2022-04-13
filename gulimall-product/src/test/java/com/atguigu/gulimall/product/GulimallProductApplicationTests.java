package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    public void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("新描述测试华为");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);

//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new LambdaQueryWrapper<BrandEntity>().eq(BrandEntity::getBrandId, 1L));
        list.forEach((item)->{
            System.out.println("打印:"+item);
        });

    }

}
