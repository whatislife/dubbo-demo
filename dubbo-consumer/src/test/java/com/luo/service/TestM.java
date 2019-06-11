package com.luo.service;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhht.tob.common.util.primarykey.SnowFlakeStrategy;
import com.zhht.tob.standard.park.entity.MonitorWorkstationRecord;
import com.zhht.tob.standard.park.service.MonitorWorkstationRecordService;

public class TestM {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		MonitorWorkstationRecordService monitorWorkstationRecordService = (MonitorWorkstationRecordService) context.getBean("monitorWorkstationRecordService");
		MonitorWorkstationRecord entity = new MonitorWorkstationRecord();
//		private java.lang.Long workstationRecordId;//   
//		private java.lang.String name;//   辅工作站名称
//		private java.lang.Long parkId;//   停车场ID
//		private java.lang.Integer eventType;//   事件类型 1连接断开 2连接恢复
//		private java.util.Date eventTime;//   发生事件时间
//		private java.lang.Integer msType;//   工作站类型 0主工作站 1 辅工作站
		entity.setEventTime(new Date());
		entity.setEventType(133);
		entity.setMsType(0);
		entity.setParkId(SnowFlakeStrategy.getPrimaryId());
		entity.setName("测试ssssssssssssssssssssssssssss");
		entity.setWorkstationRecordId(SnowFlakeStrategy.getPrimaryId());
		System.out.println(System.currentTimeMillis());
		//Integer i = monitorWorkstationRecordService.addMonitorWorkstationRecord(entity);
		System.out.println(System.currentTimeMillis());
		//System.out.println(i);
	}

}
