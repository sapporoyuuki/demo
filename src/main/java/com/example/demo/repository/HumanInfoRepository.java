package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.HumanInfoDto;

@Mapper
@Repository
public interface HumanInfoRepository {

	/**
     * 名前に基く情報を取得する
     * @return 情報
     */
	HumanInfoDto select(String name);
	
}
