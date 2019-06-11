package com.luo.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhht.cop.service.CopTaskSendService;
import com.zhht.cop.util.FinallyTypeEnum;
import com.zhht.cop.vo.CheckTaskRecordVO;
import com.zhht.tob.standard.cache.service.RedisCacheService;

public class ConsumerSendTaskServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		CopTaskSendService copTaskSendService = (CopTaskSendService) context.getBean("copTaskSendService");
		/*Map<String,String> map = new HashMap<String,String>();
		map.put("parkId", "4cc89375_2f76_11e7_9041_c22a1f0f8ab6");
		map.put("channelName", "������");
		try {
			copTaskSendService.pushTaskNum(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		CheckTaskRecordVO ct = new CheckTaskRecordVO();
		ct.setRecordId("326109836267884544");
		ct.setDataType(1);
		ct.setFinallyType(FinallyTypeEnum.Ignore.getValue());
		ct.setType(0);
		ct.setFinallyNumber("��A12345");//plateNumber�޸�
		ct.setCarColor("��");
		ct.setRecordCode("9ca9f055-6ead-4421-965e-05936839e877");
		ct.setEntryTime(new Date());
		ct.setImagePathSmall("");
		ct.setImagePath("");
		ct.setInCross("����2");
		ct.setOutCross("");
		ct.setFinallyCarColor("��");
		ct.setAiCarColor("��");
		ct.setAiPlateNumber("��A12345");//plateNumber�޸�
		try {
			copTaskSendService.checkNumberAndExceptionIsNotCar(ct);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
