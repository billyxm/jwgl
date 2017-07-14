package jwgl.Dao.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.CourseSelect;
import jwgl.model.HaveCourse;
import jwgl.util.DB;

public class StuCouSelectDAO {
	
	
	public List<CourseSelect> getcscher(){
		List<CourseSelect> csMap = new ArrayList<CourseSelect>();
		try {
			Connection conn = DB.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM course_select";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				CourseSelect cst = new CourseSelect();
				cst.setId(rs.getInt(1));
				cst.setCno(rs.getString(2));
				cst.setCname(rs.getString(3));
				cst.setTname(rs.getString(4));
				cst.setChour(rs.getString(5));
				cst.setExamway(rs.getString(6));
				csMap.add(cst);
			}
			return csMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//
	public boolean addTeacher(HaveCourse cs){
		int result=0;
	
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		String sno = (String)session.get("sno");
		try {
			Connection conn = DB.getConnection();
			String sql="insert into havecourse(sno,cno,cname,tname,chour,examway) values(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, sno);
			ps.setString(2, cs.getCno());
			ps.setString(3, cs.getCname());
			ps.setString(4, cs.getTname());
			ps.setString(5, cs.getChour());
			ps.setString(6, cs.getExamway());
//			ps.setString(7, cs.getClasstime());
			ps.executeUpdate();
			String sql2 = "select * from havecourse where sno=?";
			ps = conn.prepareStatement(sql2);
			ps.setString(1,sno);
			System.out.println(sno);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				cs.setSno(rs.getString(1));
				cs.setCno(rs.getString(2));
				cs.setCname(rs.getString(3));
				cs.setTname(rs.getString(4));
				cs.setChour(rs.getString(5));
				cs.setExamway(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result>0?true:false;
	}
}
