package jwgl.action;
//退出系统

import java.util.Map;

import com.opensymphony.xwork2.ActionContext; 
import com.opensymphony.xwork2.ActionSupport;
public class LogoutAction extends ActionSupport {

 
    private static final long serialVersionUID = 1L;


    @Override 
    public String execute() throws Exception { 
        Map<String, Object> attibutes = ActionContext.getContext().getSession(); 
        //记得退出的时候清除session，否则下次登录是当前的值
        attibutes.remove("userId"); 
        attibutes.remove("tno");
        System.out.println("刚刚有人退出系统了");
        attibutes.remove("name"); 
        attibutes.remove("tname"); 
        attibutes.remove("sname"); 
        
        return SUCCESS; 
    } 
}