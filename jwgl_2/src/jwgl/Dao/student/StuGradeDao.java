package jwgl.Dao.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.Grade;
import jwgl.util.DB;

public class StuGradeDao {
	private Grade ga = new Grade();
		
	//
	public List<Grade> getGrade(){
		List<Grade> gaMap = new ArrayList<Grade>();
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		String sname = (String)session.get("sname");
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "select * from grade where sno in (select sno from student where sname=?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1,sname);
			System.out.println(sname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Grade ga= new Grade();
				ga.setId(rs.getInt(1));
				ga.setSno(rs.getString(2));
				ga.setCno(rs.getString(3));
				ga.setCname(rs.getString(4));
				ga.setGrade(rs.getInt(5));
				ga.setWay(rs.getString(6));
				gaMap.add(ga);
			}
			return gaMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Grade getGa() {
		return ga;
	}

	public void setGa(Grade ga) {
		this.ga = ga;
	}
	
}
