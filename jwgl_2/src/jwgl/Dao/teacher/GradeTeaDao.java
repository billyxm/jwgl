package jwgl.Dao.teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jwgl.model.Grade;
import jwgl.util.DB;

public class GradeTeaDao {
	public boolean addGrade(Grade ga){
		int result =0;
		try {
			Connection conn = DB.getConnection();
			String sql="Insert into grade(sno,cno,cname,grade,way) values(?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ga.getSno());
			ps.setString(2, ga.getCno());
			ps.setString(3,ga.getCname());
			ps.setInt(4, ga.getGrade());
			ps.setString(5, ga.getWay());;
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ?true:false;
	}
}
