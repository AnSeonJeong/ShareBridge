package com.sharebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MypageController {
	@RequestMapping(value="/mypage/mypage.do", method = RequestMethod.GET)
	public String mypageView() {
		return "mypage_main";
	}
}
