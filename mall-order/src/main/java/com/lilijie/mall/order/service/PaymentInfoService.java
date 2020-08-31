package com.lilijie.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:30:55
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

