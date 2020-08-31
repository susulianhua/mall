package com.lilijie.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * skuͼƬ
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 11:45:29
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

