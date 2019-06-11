package com.luo.service;

import com.github.pagehelper.PageInfo;
import com.luo.service.impl.MonthcarOptrecords;
import com.luo.service.impl.ParkUser;

public interface TestService {
	public MonthcarOptrecords getName();
	
	public PageInfo<MonthcarOptrecords>  getName2();
}
