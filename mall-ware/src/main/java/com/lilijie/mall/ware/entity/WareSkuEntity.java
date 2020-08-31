package com.lilijie.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 13:34:41
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 
	 */
	private Long wareId;
	/**
	 * 
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 
	 */
	private Integer stockLocked;

}
