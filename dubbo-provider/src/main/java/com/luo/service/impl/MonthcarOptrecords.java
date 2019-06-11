package com.luo.service.impl;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.zhht.tob.framework.vo.SuperVO;
//import com.zhbc.framework.vo.SuperVO;
/**
 * 
 * <br>
 * <b>功能：</b>MonthcarOptrecordsEntity<br>
 */
public class MonthcarOptrecords extends SuperVO {
	
	
	private java.lang.String monthcarOptrecordsId;//   月卡操作记录ID
	private java.lang.String parkId;//   车场ID
	private java.lang.String plateNum;//   车牌号
	private java.lang.String plateColor;//   车牌颜色
	private java.lang.String inputChannel;//   录入渠道 0=添加 \n 1= 导入
	private java.lang.String dataType;	//数据类型
	private java.lang.String operator;//   操作员
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private java.util.Date beginTime;//   开始时间
	//@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private java.util.Date endTime;//   结束时间
	//@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private java.util.Date inputTime;//   录入时间
	//@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private java.util.Date delTime;//   删除时间
	
	
	public java.lang.String getMonthcarOptrecordsId() {
	    return this.monthcarOptrecordsId;
	}
	public void setMonthcarOptrecordsId(java.lang.String monthcarOptrecordsId) {
	    this.monthcarOptrecordsId=monthcarOptrecordsId;
	}
	public java.lang.String getParkId() {
	    return this.parkId;
	}
	public void setParkId(java.lang.String parkId) {
	    this.parkId=parkId;
	}
	public java.lang.String getPlateNum() {
	    return this.plateNum;
	}
	public void setPlateNum(java.lang.String plateNum) {
	    this.plateNum=plateNum;
	}
	public java.lang.String getPlateColor() {
	    return this.plateColor;
	}
	public void setPlateColor(java.lang.String plateColor) {
	    this.plateColor=plateColor;
	}
	public Date getBeginTime() {
	    return this.beginTime;
	}
	public void setBeginTime(Date beginTime) {
	    this.beginTime=beginTime;
	}
	public Date getEndTime() {
	    return this.endTime;
	}
	public void setEndTime(Date endTime) {
	    this.endTime=endTime;
	}
	public Date getInputTime() {
	    return this.inputTime;
	}
	public void setInputTime(Date inputTime) {
	    this.inputTime=inputTime;
	}
	public Date getDelTime() {
	    return this.delTime;
	}
	public void setDelTime(Date delTime) {
	    this.delTime=delTime;
	}
	public java.lang.String getInputChannel() {
	    return this.inputChannel;
	}
	public void setInputChannel(java.lang.String inputChannel) {
	    this.inputChannel=inputChannel;
	}
	public java.lang.String getOperator() {
	    return this.operator;
	}
	public void setOperator(java.lang.String operator) {
	    this.operator=operator;
	}
	public java.lang.String getDataType() {
		return this.dataType;
	}
	public void setDataType(java.lang.String dataType) {
		this.dataType = dataType;
	}
}

