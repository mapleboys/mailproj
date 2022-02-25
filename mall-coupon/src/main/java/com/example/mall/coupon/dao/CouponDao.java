package com.example.mall.coupon.dao;

import com.example.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author gy
 * @email gy@gmail.com
 * @date 2022-02-25 09:47:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
