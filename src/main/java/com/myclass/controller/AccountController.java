package com.myclass.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.myclass.dto.UserDto;
import com.myclass.service.UserService;
import com.myclass.util.UrlConstants;


@Controller
@RequestMapping(value = "")
public class AccountController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = UrlConstants.Client.ACCOUNT_REGISTER)
	@ResponseBody
	public Object register(@RequestBody UserDto userDto) {
		Map<String, String> obj = new HashMap<String, String>();
		if (userService.resgiter(userDto)) {
			obj.put("status", "true");
			obj.put("message", "Đăng ký tài khoảng thành công!");
		} else {
			obj.put("status", "false");
			obj.put("message", "Đăng ký tài khoảng không thành công!");
		}
		return obj;
	}
}
