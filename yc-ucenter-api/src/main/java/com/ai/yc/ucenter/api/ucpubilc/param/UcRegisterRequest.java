package com.ai.yc.ucenter.api.ucpubilc.param;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.ai.opt.base.vo.BaseInfo;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2017年2月16日 下午3:29:44 
 * @version 
 * @since  
 */
public class UcRegisterRequest extends BaseInfo  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * 用户名称
     */
    private String username;
    /**
     * 移动电话（可用于登录）
     */
//    @MobilePhone(message="这不是合法的移动电话号码")
    private String mobilephone;
    /**
     * 邮箱
     */
    @Email
    private String email;
    /**
     * 密码
     */
    private String password;
    
    /**
     * 注册IP
     */
    @NotBlank(message="IP地址不能为空")
    private String regip;
    
    /**
     * 用户来源系统 
		0：内部系统 gtcom
		1：金山 jinshan
		2：百度用户baidu
		3：微信 weixin
		4：腾讯用户qq
		5：新浪用户sina
     */
    @NotBlank
    private String usersource;
    
    /**
     * 第三方系统用户ID
     */
    private String thirduid;
    
    /**
     * 许可登录方式，默认全部
		0：全部
		1：邮箱密码
		2：手机密码
		3：手机动态密码
		4：用户名密码

     */
    @NotBlank
    private String loginmode;
    
    /**
     * 注册方式
		1：邮箱密码
		2：手机密码
		3：手机动态密码
		4：用户名密码
     */
    @NotBlank
    private String loginway;
    
    
    /**
     * 创建时间（根据创建时间判断，24小时未激活，删除未激活记录。）年月日时分秒
     */
    @NotBlank
    private String createtime;
    
    private String domain_name;
    
    private String systemsource;
    
    public String getDomain_name() {
		return domain_name;
	}


	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}


	public String getSystemsource() {
		return systemsource;
	}


	public void setSystemsource(String systemsource) {
		this.systemsource = systemsource;
	}


	public String getOperationcode() {
		return operationcode;
	}


	public void setOperationcode(String operationcode) {
		this.operationcode = operationcode;
	}


	private String operationcode;
    


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMobilephone() {
		return mobilephone;
	}


	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRegip() {
		return regip;
	}


	public void setRegip(String regip) {
		this.regip = regip;
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


	public String getLoginmode() {
		return loginmode;
	}


	public void setLoginmode(String loginmode) {
		this.loginmode = loginmode;
	}


	public String getLoginway() {
		return loginway;
	}


	public void setLoginway(String loginway) {
		this.loginway = loginway;
	}


	public String getCreatetime() {
		return createtime;
	}


	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
    
    
}
