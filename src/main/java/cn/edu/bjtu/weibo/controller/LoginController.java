package cn.edu.bjtu.weibo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bjtu.weibo.model.LoginUser;

@RestController
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Map<String, Object> login(@RequestBody LoginUser user)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("token", user.getUsername()+user.getPassword());
		return map;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public Map<String, Object> register(@RequestBody LoginUser user)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("token", user.getUsername()+user.getPassword());
		return map;
	}
}
