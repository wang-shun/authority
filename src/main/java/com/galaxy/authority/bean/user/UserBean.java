package com.galaxy.authority.bean.user;

import java.util.Date;

import com.galaxy.authority.common.DateUtil;

public class UserBean {
	private long id;
	private String loginName;
	private String userName;
	private String telphone;
	private String mobilePhone;
	private String email1;
	private String email2;
	private String employNo;			//工号
	private int sex;
	private String password;	
	private String originPassword;		//原始密码
	private int isShow;
	private int isDel;
	private int isOuttage;
	private long createTime;
	private long createId;
	private long updateTime;
	private long updateId;
	private long companyId;
	private String address;
	private int isAdmin;
	
	public UserBean(){
		this.loginName = " ";
		this.userName = " ";
		this.telphone = " ";
		this.mobilePhone = " ";
		this.email1 = "";
		this.email2 = "";
		this.employNo = "";
		this.isShow = 0;
		this.isDel = 0;
		this.isOuttage = 0;
		this.createTime = DateUtil.getMillis(new Date());
		this.updateTime = DateUtil.getMillis(new Date());
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmployNo() {
		return employNo;
	}
	public void setEmployNo(String employNo) {
		this.employNo = employNo;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getOriginPassword() {
		return originPassword;
	}
	public void setOriginPassword(String originPassword) {
		this.originPassword = originPassword;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	public int getIsOuttage() {
		return isOuttage;
	}
	public void setIsOuttage(int isOuttage) {
		this.isOuttage = isOuttage;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public long getCreateId() {
		return createId;
	}
	public void setCreateId(long createId) {
		this.createId = createId;
	}
	public long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
	public long getUpdateId() {
		return updateId;
	}
	public void setUpdateId(long updateId) {
		this.updateId = updateId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
}
