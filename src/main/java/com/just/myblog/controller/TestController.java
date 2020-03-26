package com.just.myblog.controller;


import com.just.myblog.dao.RoleMapper;
import com.just.myblog.dao.TagMapper;
import com.just.myblog.domain.Role;
import com.just.myblog.domain.Tag;
import com.just.myblog.dto.UserInfo;

import com.just.myblog.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.just.myblog.domain.User;
import com.just.myblog.service.realm.RealmService;


@Controller
@ResponseBody
public class TestController {

	@Autowired
	RealmService realmService;
	@Autowired
	RedisUtils redisUtils;

	@Autowired
	RoleMapper roleMapper;


	@RequestMapping(value = "/value", method = RequestMethod.GET)
	public String getVaString() {


		User user = new User();
		user.setEmail("54214@qq.com");
		redisUtils.set("111",user);
		UserInfo userInfo=realmService.getUserInfo(user);
		return userInfo.toString()+" "+redisUtils.get("111");
	}
	@RequestMapping(value = "/insert" ,method = RequestMethod.GET)
	public String insert() {

		Role r=new Role();
		r.setRole("sbd");
		r.setDescription("111");
		int k=roleMapper.insertSelective(r);
		return ""+k;
	}
}
