package jwgl.action.teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.TeachTask;
import jwgl.util.DB;

public class TeaCouAction {
	private TeachTask cs = new TeachTask();
	
	public String all(){
		PreparedStatement ps = null;
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM course_schedule where tname=?";
			ps = conn.prepareStatement(sql);
			String tname = (String)session.get("tname");
			ps.setString(1,tname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){				
				cs.setId(rs.getInt(1));
				cs.setYear(rs.getString(2));
				cs.setTerm(rs.getString(3));
				cs.setClassnum(rs.getString(4));
				cs.setCname(rs.getString(5));
				cs.setTname(rs.getString(6));
				cs.setChour(rs.getString(7));
				cs.setBegin(rs.getString(8));
				cs.setEnd(rs.getString(9));
				cs.setExamway(rs.getString(10));
				cs.setClasssite(rs.getString(11));
				cs.setClasstime(rs.getString(12));
				cs.setExamtime(rs.getString(13));
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		return "success";
		}

	public TeachTask getCs() {
		return cs;
	}

	public void setCs(TeachTask cs) {
		this.cs = cs;
	}
	
	
}
