package jwgl.action.teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.Teacher;
import jwgl.util.DB;

public class TeacherProfile {
	private Teacher tea = new Teacher();
	
	public String all(){
		PreparedStatement ps = null;
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM teacher where tname=?";
			ps = conn.prepareStatement(sql);
			String tname = (String)session.get("tname");
			ps.setString(1,tname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){				
				tea.setId(rs.getInt(1));
				tea.setTno(rs.getString(2));
				tea.setTname(rs.getString(3));
				tea.setTsex(rs.getString(4));
				tea.setBorndate(rs.getString(5));
				tea.setTel(rs.getString(6));
				tea.setEmail(rs.getString(7));
				tea.setCollege(rs.getString(8));
				tea.setDepartment(rs.getString(9));
				tea.setEducation(rs.getString(10));
				tea.setProfessional(rs.getString(11));
				tea.setDirection(rs.getString(12));
				tea.setGradpro(rs.getString(13));
				tea.setGradschool(rs.getString(14));
				tea.setBrief(rs.getString(15));
				tea.setIndate(rs.getString(16));
				tea.setTpassword(rs.getString(17));
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		return "success";}

	public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}
}
