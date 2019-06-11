package com.luo.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.luo.service.TestService;

public class TestServiceImpl implements TestService {

	public MonthcarOptrecords getName() {
		MonthcarOptrecords user = new MonthcarOptrecords();
		user.setBeginTime(new Date());
		user.setInputChannel("sdfsfdsdf");
		return user;
	}

	public PageInfo<MonthcarOptrecords> getName2() {
		List<MonthcarOptrecords> list =new ArrayList<MonthcarOptrecords>();
		MonthcarOptrecords m1 = new MonthcarOptrecords();
		m1.setBeginTime(new Date());
		m1.setInputChannel("ÄãºÃ ");
		MonthcarOptrecords m2 = new MonthcarOptrecords();
		m2.setBeginTime(new Date());
		m2.setInputChannel("ÄãºÃ2 ");
		list.add(m1);
		list.add(m2);
		PageInfo<MonthcarOptrecords> page = new PageInfo<MonthcarOptrecords>(list);
		return page;
	}

}
