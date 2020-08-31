package com.lilijie.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilijie.common.utils.PageUtils;
import com.lilijie.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 
 *
 * @author lilijie
 * @email 982341816@qq.com
 * @date 2020-08-28 12:51:13
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

