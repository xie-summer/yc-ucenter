package com.ai.yc.ucenter.api.members.param.get;


import com.ai.yc.ucenter.api.members.param.base.UcBaseResponse;

/**
 * Ucenter-用户信息查询结果类<br>
 * Date: 2016年11月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author mengbo
 */
public class UcMembersGetResponse extends UcBaseResponse {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private UcMembersGetDate date;
	
	
	public UcMembersGetDate getDate() {
		return date;
	}


	public void setDate(UcMembersGetDate date) {
		this.date = date;
	}


	public static class UcMembersGetDate{
		/**
	     * 用户id
	     */
	    private Integer uid;
		/**
	     * 用户名
	     */
	    private String username;
		/**
	     * 邮箱
	     */
	    private String email;
		/**
	     * 移动电话
	     */    
	    private String mobilephone;
		/**
	     * 密码
	     */    
	    private String password;
		/**
	     * 许可登录方式：loginmode
	     * 0：全部
	     * 1：邮箱密码
	     * 	2：手机密码
	     * 3：手机动态密码
	     * 4：用户名密码
	     */    	    
	    private String loginmode;
		/**
	     * 注册时间
	     */  
	    private String createtime;
		/**
	     * 用户来源
	     * 用户来源系统 
		* 0：内部系统 gtcom
		* 1：金山 jinshan
		* 2：百度用户baidu
		* 3：微信 weixin
		* 4：腾讯用户qq
		* 5：新浪用户sina

	     */   
	    private String usersource;
		/**
	     * 第三方
	     */  
	    private String thirduid;
	    
	

		public Integer getUid() {
			return uid;
		}

		public void setUid(Integer uid) {
			this.uid = uid;
		}



		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobilephone() {
			return mobilephone;
		}

		public void setMobilephone(String mobilephone) {
			this.mobilephone = mobilephone;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getLoginmode() {
			return loginmode;
		}

		public void setLoginmode(String loginmode) {
			this.loginmode = loginmode;
		}

		public String getCreatetime() {
			return createtime;
		}

		public void setCreatetime(String createtime) {
			this.createtime = createtime;
		}

		public String getUsersource() {
			return usersource;
		}

		public void setUsersource(String usersource) {
			this.usersource = usersource;
		}

		public String getThirduid() {
			return thirduid;
		}

		public void setThirduid(String thirduid) {
			this.thirduid = thirduid;
		}

	  
	    
	}
	



}
