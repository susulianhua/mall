package com.lilijie.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:34:41
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

