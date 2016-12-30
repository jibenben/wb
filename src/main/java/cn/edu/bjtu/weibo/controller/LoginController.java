package cn.edu.bjtu.weibo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bjtu.weibo.model.LoginUser;
import cn.edu.bjtu.weibo.model.Result;
import cn.edu.bjtu.weibo.service.LoginService;
import cn.edu.bjtu.weibo.service.RegisterService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Result login(@RequestBody LoginUser user)
	{
		String token = loginService.getLoginUserToken(user);
		Result result = new Result();
		if(token == null || token.isEmpty())
		{
			result.setStatus(Result.FAILED);
			result.setTipCode("401");
			result.setTipMsg("Login falied");
			return result;
		}
		
		result.setStatus(Result.SUCCESS);
		result.setTipCode("200");
		result.setTipMsg("Login success");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("token", token);
		result.setData(map);
		return result;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public Result register(@RequestBody LoginUser user)
	{
		Result result = new Result();
		boolean isRegisterSuccess = registerService.registerNewUser(user);
		if(!isRegisterSuccess)
		{
			result.setStatus(Result.FAILED);
			result.setTipCode("400");
			result.setTipMsg("register falied");
			return result;
		}
		result.setStatus(Result.SUCCESS);
		result.setTipCode("200");
		result.setTipMsg("register success");
		return result;
	}
}
