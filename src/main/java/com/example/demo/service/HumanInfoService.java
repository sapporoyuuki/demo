package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HumanInfoDto;
import com.example.demo.form.HumanInfoForm;
import com.example.demo.repository.HumanInfoRepository;

@Service
public class HumanInfoService {

	/* humanリポジトリ */
	@Autowired
	protected HumanInfoRepository repository;

	/**
     * 名前に基く情報を取得する
     * @return 情報
     */
	public String judgeHuman(HumanInfoForm request) {

		// 名前に基く情報を取得する
		HumanInfoDto dto = repository.select(request.getName());

		// レスポンス生成
		String response = dto.getName() + "さんは" + dto.getAge() + "歳で" + dto.getFeature() + "な人間です";

		// 返却
		return response;
	}

}
