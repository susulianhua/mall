package com.lilijie.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 11:45:29
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

