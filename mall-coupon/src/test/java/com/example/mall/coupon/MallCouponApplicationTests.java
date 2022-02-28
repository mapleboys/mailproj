package com.example.mall.coupon;

import com.example.mall.coupon.entity.CouponEntity;
import com.example.mall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallCouponApplicationTests {
	@Autowired
	CouponService couponService;
	@Test
	void contextLoads() {
		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setCouponName("满100-30");
		boolean save = couponService.save(couponEntity);
		System.out.println("保存成功");

	}

}
