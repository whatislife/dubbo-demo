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
//		private java.lang.String name;//   ������վ����
//		private java.lang.Long parkId;//   ͣ����ID
//		private java.lang.Integer eventType;//   �¼����� 1���ӶϿ� 2���ӻָ�
//		private java.util.Date eventTime;//   �����¼�ʱ��
//		private java.lang.Integer msType;//   ����վ���� 0������վ 1 ������վ
		entity.setEventTime(new Date());
		entity.setEventType(133);
		entity.setMsType(0);
		entity.setParkId(SnowFlakeStrategy.getPrimaryId());
		entity.setName("����ssssssssssssssssssssssssssss");
		entity.setWorkstationRecordId(SnowFlakeStrategy.getPrimaryId());
		System.out.println(System.currentTimeMillis());
		//Integer i = monitorWorkstationRecordService.addMonitorWorkstationRecord(entity);
		System.out.println(System.currentTimeMillis());
		//System.out.println(i);
	}

}
