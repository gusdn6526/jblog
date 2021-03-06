package com.bigdata2017.jblog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata2017.jblog.dto.JSONResult;
import com.bigdata2017.jblog.service.UserService;

@RequestMapping("/api/user")
@Controller("userAPIController")
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody	
	@RequestMapping("/checkid")
	public JSONResult checkId(@RequestParam(value = "id", required = true, defaultValue = "") String id) {
		boolean bExist = userService.existUser(id);
		return JSONResult.success(bExist);
		
		
	}
}
