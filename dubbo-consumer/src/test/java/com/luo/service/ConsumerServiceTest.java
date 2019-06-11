package com.luo.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhht.tob.standard.cache.service.RedisCacheService;

public class ConsumerServiceTest {

	public static void main(String[] args) {
		String PARK_TOKEN = "CPSK-Test";
		String token="33333333";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		RedisCacheService testService = (RedisCacheService) context.getBean("testService");
//		testService.get("user");
		ParkUser user = new ParkUser();
		user.setLastLoginIp("2222");
		user.setPassword("sdfsdfsdf");
		user.setToken("sdfsdfs");
		testService.set(PARK_TOKEN+token, user,3600);
		
		
		Map<String,Object> users = (Map<String,Object>)testService.get(PARK_TOKEN+token);
		//ParkUser users = testService.get(PARK_TOKEN+token);
		System.out.println(users);
		
		
		testService.set("songjian-test", "ddddd",60);
		String name = (String)testService.get("songjian-test");
		System.out.println(name);
		
		
		String channel="CHANNEL_MAPPING_";
		
		List<Long> channelMappingList = new ArrayList<Long>();
		Set<byte[]> keys = testService.keys(channel + "*");
		if (keys.size() > 0) {
			for (byte[] keyBytes : keys) {
				String redisKey = new String(keyBytes);
				//channelMappingList.add(Long.valueOf(redisKey.substring(channel.length())));
				System.out.println(redisKey.substring(channel.length()));
			}
		}
		//		System.out.println(testService.getName());
//        try {
//			System.in.read();
//		} catch (IOException e) {		
//			e.printStackTrace();
//		}  

	}

}
