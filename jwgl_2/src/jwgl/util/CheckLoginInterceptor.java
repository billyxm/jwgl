package jwgl.util;
//拦截器，拦截未登录的用户
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CheckLoginInterceptor extends AbstractInterceptor {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String intercept(ActionInvocation invocation) throws Exception {
        //获取ActionContext
        ActionContext ac = invocation.getInvocationContext();
        //获取session
        Map<String, Object> session = ac.getSession();
        //获取session中的用户信息
        String name = (String)session.get("name");
        String tname = (String)session.get("tname");
        String sname = (String)session.get("sname");
        //判断用户信息是否正确
        if(name != null ||tname !=null||sname!=null) {
            return invocation.invoke();
        }else {
            return "relogin";
        } 
    }
 
}