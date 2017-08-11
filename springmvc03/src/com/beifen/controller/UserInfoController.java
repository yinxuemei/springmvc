package com.beifen.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beifen.domain.UserInfo;

@Controller
public class UserInfoController {

	@RequestMapping("/query1.do")
	public String queryUser1(HttpServletRequest request){
		
		String name = "张三";
		request.setAttribute("name", name);
		
		UserInfo user = new UserInfo();
		user.setUserId(9257);
		user.setUserName("华安");
		
		request.setAttribute("user", user);
		
		return "index";
	}
	
	@RequestMapping("/query2.do")
	public ModelAndView queryUser2(){
		
		UserInfo user = new UserInfo();
		user.setUserId(1001);
		user.setUserName("秋香");
		
		//model
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("user2", user);
		
		return new ModelAndView("index",map);
	}
	
	@RequestMapping("/query3.do")
	public String queryUser3(Map<String,Object> map){
		
		UserInfo user = new UserInfo();
		user.setUserId(1002);
		user.setUserName("石榴");
	
		map.put("user3", user);
		
		return "index";
	}
	
	/**
	 * 相当于ModelAndView 里面的Model
	 * @param model
	 * @return
	 */
	@RequestMapping("/query4.do")
	public String queryUser4(Model  model){
		
		
		UserInfo user  = new UserInfo();
		user.setUserId(1);
		user.setUserName("华夫人");
		
		model.addAttribute("user4", user);
		
		return "index";
	}
	
	/**
	 * 相当于ModelAndView 里面的Model
	 * @param model
	 * @return
	 */
	@RequestMapping("/query5.do")
	public String queryUser5(Model  model){
		
		
		
		UserInfo user  = new UserInfo();
		user.setUserId(1);
		user.setUserName("华夫人");
		
		List<UserInfo> list = new ArrayList<UserInfo>();
		
		list.add(user);
		list.add(user);
		list.add(user);
		
		model.addAttribute("list", list);
		
		return "index";
	}
	
	
	
}
