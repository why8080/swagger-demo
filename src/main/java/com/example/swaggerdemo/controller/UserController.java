package com.example.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swaggerdemo.bean.Info;
import com.example.swaggerdemo.bean.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "2 用户管理相关接口")
@RequestMapping("/user")
public class UserController {
	@PostMapping("/")
	@ApiOperation("2.1 添加用户的接口")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
		@ApiImplicitParam(name = "address" , value = "用户地址", defaultValue = "深圳", required = true)
	})
	public String addUser(String username, @RequestParam(required = true) String address){
		return "success";
	}
	
	@PutMapping("/")
	@ApiOperation("2.2 根据id查询用户接口")
	@ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
	public User getUserById(@RequestBody Integer id){
		User user = new User();
		user.setId(id);
		return user;
	}
	
	@PutMapping("/{id}")
	@ApiOperation("2.3 根据id更新用户的接口")
	public User updateUserById(@RequestBody User user){
		return user;
	}
	
	@GetMapping("/info")
	@ApiOperation("2.4 获取Info信息")
	public List<Info> getInfo(){
		List<Info> infos = new ArrayList<Info>();
		Info info1 = new Info("张家界","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		Info info2 = new Info("武当山","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		Info info3 = new Info("神龙架","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		Info info4 = new Info("黄鹤楼","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		return infos;
	}
	
	@PostMapping("/message")
	@ApiOperation("2.5 获取Message信息")
	public List<Info> getMessage(){
		List<Info> infos = new ArrayList<Info>();
		Info info1 = new Info("张家界","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		Info info2 = new Info("武当山","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		Info info3 = new Info("神龙架","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		Info info4 = new Info("黄鹤楼","https://seopic.699pic.com/photo/50133/7825.jpg_wh1200.jpg");
		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		return infos;
	}
	
	
	
}
