package com.example.mall.member.dao;

import com.example.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gy
 * @email gy@gmail.com
 * @date 2022-02-25 09:50:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
