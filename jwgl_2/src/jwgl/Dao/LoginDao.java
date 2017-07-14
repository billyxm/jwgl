package jwgl.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.Student;
import jwgl.model.Teacher;
import jwgl.model.User;
import jwgl.util.DB;

public class LoginDao {
	private String name;
	private String tname;
	private String sname;

	//老师
	public boolean teacherLogin(Teacher tea){
		int result = 0;
		PreparedStatement ps = null;
		try {	
			Connection conn = DB.getConnection();
			String sql = "SELECT tname FROM teacher WHERE tno = ? AND tpassword = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, tea.getTno());
			ps.setString(2, tea.getTpassword());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result =1;
			 tname = rs.getString(1);
				Map<String, Object> attibutes = ActionContext.getContext()
						.getSession();
				// 记录用户登录信息
				attibutes.put("tname", tname);				
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	
	//管理员
	public boolean adminLogin(User user){
		int result = 0;
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT name FROM user WHERE userId = ? AND password = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserId());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result=1;
				name = rs.getString(1);
				Map<String, Object> attibutes = ActionContext.getContext()
						.getSession();
				// 记录用户登录信息
				attibutes.put("UserId", user.getUserId());
				attibutes.put("password", user.getPassword());
				attibutes.put("name", name);				
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
		
	}
	//学生
	public boolean studentLogin(Student stu){
		int result = 0;
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT sname FROM student WHERE sno = ? AND password = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getSno());
			ps.setString(2, stu.getPassword());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result=1;
				sname = rs.getString(1);
				Map<String, Object> attibutes = ActionContext.getContext()
						.getSession();
				// 记录用户登录信息
				attibutes.put("sno", stu.getSno());
				attibutes.put("password", stu.getPassword());
				attibutes.put("sname",sname);				
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
