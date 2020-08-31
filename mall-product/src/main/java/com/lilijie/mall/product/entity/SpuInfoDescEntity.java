package com.lilijie.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu
 * 
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 11:45:29
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long spuId;
	/**
	 * 
	 */
	private String decript;

}
