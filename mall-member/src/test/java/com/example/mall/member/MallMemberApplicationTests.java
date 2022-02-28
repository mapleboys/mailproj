package com.example.mall.member;

import com.example.mall.member.entity.GrowthChangeHistoryEntity;
import com.example.mall.member.service.GrowthChangeHistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallMemberApplicationTests {

	@Autowired
	GrowthChangeHistoryService growthChangeHistoryService;

	@Test
	void contextLoads() {
		GrowthChangeHistoryEntity growthChangeHistoryEntity = new GrowthChangeHistoryEntity();
		growthChangeHistoryEntity.setChangeCount(1);
		growthChangeHistoryService.save(growthChangeHistoryEntity);
		System.out.println("完成插入");
	}

}
