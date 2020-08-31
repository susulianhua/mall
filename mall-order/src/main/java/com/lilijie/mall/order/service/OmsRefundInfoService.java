package com.lilijie.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.order.entity.OmsRefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:28:25
 */
public interface OmsRefundInfoService extends IService<OmsRefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

