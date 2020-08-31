package com.lilijie.mall.order.dao;

import com.lilijie.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:30:55
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
