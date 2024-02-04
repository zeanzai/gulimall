package com.atguigu.gulimall.member.service;

import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author zeanzai
 * @email zeanzai.me@gmail.com
 * @date 2023-08-25 12:00:48
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

