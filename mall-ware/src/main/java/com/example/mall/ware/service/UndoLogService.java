package com.example.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author gy
 * @email gy@gmail.com
 * @date 2022-02-25 09:55:23
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

