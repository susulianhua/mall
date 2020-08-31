package com.lilijie.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:34:41
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

