package com.lilijie.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.order.entity.OmsOrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:28:25
 */
public interface OmsOrderSettingService extends IService<OmsOrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

