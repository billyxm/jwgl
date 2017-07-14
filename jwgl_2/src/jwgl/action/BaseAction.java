package jwgl.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 * @author YWX
 * 
 * 定义一个所有Action类的父类用来访问WEB资源中的域对象
 * */
public class BaseAction implements RequestAware,ApplicationAware,SessionAware,ParameterAware {
	protected Map<String, String[]> parameters;
	protected Map<String, Object> session;
	protected Map<String, Object>	application;
	protected Map<String, Object> request;
	@Override
	public void setParameters(Map<String, String[]> arg0) {
		// TODO Auto-generated method stub
		this.parameters=arg0;
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.application=arg0;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
		
	}

}
