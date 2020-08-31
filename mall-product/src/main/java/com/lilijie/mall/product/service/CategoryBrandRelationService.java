package com.lilijie.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * Ʒ
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 11:45:30
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

