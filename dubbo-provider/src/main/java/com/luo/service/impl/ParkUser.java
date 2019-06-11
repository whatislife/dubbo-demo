package com.luo.service.impl;

import com.zhht.tob.framework.vo.SuperVO;

/**
 * 
 * <br>
 * <b>功能�?</b>BdParkUserEntity<br>
 */
public class ParkUser extends SuperVO {
	/**
	 * 
	 */
	//private static final long serialVersionUID = -5927464997354640399L;
	private java.lang.Long parkUserId;//   主键	private java.lang.Long parkId;//   停车场ID	private java.lang.Long closedParkId;//   封闭停车场ID	private java.lang.String username;//   登录�?	private java.lang.String password;//   密码	private java.lang.String token;//   令牌	private java.util.Date createDate;//   创建时间	private java.lang.Integer synStatus;//   同步标记
	private String parkName;
	private String pwd;
	private String lastLoginIp;	public java.lang.Long getParkUserId() {	    return this.parkUserId;	}	public void setParkUserId(java.lang.Long parkUserId) {	    this.parkUserId=parkUserId;	}	public java.lang.Long getParkId() {	    return this.parkId;	}	public void setParkId(java.lang.Long parkId) {	    this.parkId=parkId;	}	public java.lang.Long getClosedParkId() {	    return this.closedParkId;	}	public void setClosedParkId(java.lang.Long closedParkId) {	    this.closedParkId=closedParkId;	}	public java.lang.String getUsername() {	    return this.username;	}	public void setUsername(java.lang.String username) {	    this.username=username;	}	public java.lang.String getPassword() {	    return this.password;	}	public void setPassword(java.lang.String password) {	    this.password=password;	}	public java.lang.String getToken() {	    return this.token;	}	public void setToken(java.lang.String token) {	    this.token=token;	}	public java.util.Date getCreateDate() {	    return this.createDate;	}	public void setCreateDate(java.util.Date createDate) {	    this.createDate=createDate;	}	public java.lang.Integer getSynStatus() {	    return this.synStatus;	}	public void setSynStatus(java.lang.Integer synStatus) {	    this.synStatus=synStatus;	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	
}

