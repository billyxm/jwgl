package jwgl.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import jwgl.Dao.LoginDao;
import jwgl.model.Student;
import jwgl.model.Teacher;
import jwgl.model.User;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private LoginDao ldo = new LoginDao();
	private User user;
	private Teacher tea;
	private Student stu;
	private String type;
	
	//登录
	public String admin(){
	 String ret = "error";
	 Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		try {
			if(type.equals("admin")){
				boolean result = ldo.adminLogin(user);
				//System.out.println(user.getUserId());
				if(result==true){
					ldo.adminLogin(user);
					ret = "admin";
					System.out.println("管理员"  +user.getUserId()+ "登录成功");
				}else{
					ret="error";
					return ret;
				}		
				//学生登录
			}else if(type.equals("student")){
				boolean result = ldo.studentLogin(stu);
				if(result==true){
					ldo.studentLogin(stu);
					ret = "student";
					System.out.println("学生"+(String)session.get("sno")+"登录成功");
				}else{
				ret = "error";
				return ret;
				}
				//教师登录
			}else{
				boolean result= ldo.teacherLogin(tea);
				if(result==true){
					ldo.teacherLogin(tea);
					ret = "teacher";
					System.out.println("教师**"+ (String)session.get("tname")+"**登录成功");
				}else{
					ret="error";
					return ret;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			ret = "error";
		}
		return ret;
	}
	
	
	public LoginDao getLdo() {
		return ldo;
	}
	public void setLdo(LoginDao ldo) {
		this.ldo = ldo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Teacher getTea() {
		return tea;
	}
	public void setTea(Teacher tea) {
		this.tea = tea;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
