package com.lilijie.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:30:55
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

