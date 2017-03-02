package com.glyl.myoffice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jay on 2017/2/14.
 *
 * @author jay
 */
@Controller
public class LoginController {
	@RequestMapping(value = "/login")
	public String login(){
		return "login/login";
	}
	@ResponseBody
	@RequestMapping(value = "/doLogin")
	public Map doLogin(){
		Map<String,Integer> map = new HashMap();
		map.put("result",200);
		return map;

	}

}
