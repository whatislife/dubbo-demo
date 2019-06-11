package com.luo.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.luo.service.impl.MonthcarOptrecords;
import com.zhht.tob.standard.cache.service.RedisCacheService;

public class ConsumerServiceTest2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		TestService ser = (TestService) context.getBean("testService");
		PageInfo<MonthcarOptrecords> user = ser.getName2();
		System.out.println(JSON.toJSON(user));
	}

}
