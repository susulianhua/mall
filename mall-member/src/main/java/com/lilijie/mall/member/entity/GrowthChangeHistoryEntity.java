package com.lilijie.mall.member.entity;

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
 * @date 2020-08-28 12:51:13
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer changeCount;
	/**
	 * 
	 */
	private String note;
	/**
	 * 
	 */
	private Integer sourceType;

}
