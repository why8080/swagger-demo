package com.example.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "1 欢迎界面相关接口")
@RestController
public class HelloController {
	
	@ApiOperation(value = "1.1 hello 是一个问候的函数，向大家表示友好", notes = "这是第一个函数")
	@GetMapping(value = "/hello")
	public String hello(/* 参数注解 */ @ApiParam(value = "desc of param", required=true)  @RequestParam String name){
		return "Hello " + name + "!";
	}
	
	@ApiOperation(value = "1.2 hello 是一个问候的函数，向大家表示友好", notes = "这是第一个函数")
	@GetMapping(value = "/hello2")
	public String hello2(/* 参数注解 */ @ApiParam(value = "desc of param", required=true)  @RequestParam String name){
		return "Hello " + name + "!";
	}
}
