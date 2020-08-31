package com.lilijie.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 12:44:37
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

