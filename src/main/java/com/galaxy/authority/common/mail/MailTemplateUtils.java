package com.galaxy.authority.common.mail;

import java.util.Properties;

import com.galaxy.authority.common.PropertiesUtils;
import com.galaxy.authority.common.StaticConst;


/**
 * 读取邮件内容模板 
 * <p>File：MailTemplateUtils.java</p>
 * <p>Title: MailTemplateUtils</p>
 * <p>Description:MailTemplateUtils</p>
 * <p>Copyright: Copyright (c) 2016年3月17日</p>
 * <p>Company: galaxy</p>
 * @author zhaoying
 * @version 1.0
 */
public class MailTemplateUtils {
	
	static Properties property = PropertiesUtils.getProperties(StaticConst.MAIL_TEMPLATE_FILE);
	
	/**
	 * 
	 * @param template 从Constants中取值,三类模板MAIL_URGE_CONTENT,MAIL_RESTPWD_CONTENT,MAIL_FILESHARE_CONTENT
	 * @return
	 */
	public static String getContentByTemplate(String template) {
		 return property.getProperty(template);
	}
}
