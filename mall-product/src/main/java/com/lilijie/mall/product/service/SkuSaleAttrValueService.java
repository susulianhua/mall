package com.lilijie.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 11:45:29
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

