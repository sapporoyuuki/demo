package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.HumanInfoForm;
import com.example.demo.service.HumanInfoService;

@RestController
@RequestMapping("api")
public class HumanInfoController {

	/* Humanサービス */
	@Autowired
	protected HumanInfoService service;

	/**
     * 名前に基く情報を取得する
     * @return 情報
     */
	@RequestMapping("humanFeature")
	private String humanFeature(@RequestBody HumanInfoForm request) {

		// DBから名前に基く情報を取得して返す
		return service.judgeHuman(request);
	}

}