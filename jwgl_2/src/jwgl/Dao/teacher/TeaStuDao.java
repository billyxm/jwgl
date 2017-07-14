package jwgl.Dao.teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.Student;
import jwgl.util.DB;

public class TeaStuDao {
	//get student
	private Student stu = new Student();
	public List<Student> getStudent() {
		List<Student> stuMap = new ArrayList<Student>();
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		String tname = (String)session.get("tname");
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "select * from student where classnum =(select classnum from course_schedule where tname=?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1,tname);
			System.out.println(tname);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setSno(rs.getString(2));
				stu.setSname(rs.getString(3));
				stu.setPinyin(rs.getString(4));
				stu.setSsex(rs.getString(5));
				stu.setBeforename(rs.getString(6));
				stu.setEngname(rs.getString(7));
				stu.setIdtype(rs.getString(8));
				stu.setIdnum(rs.getString(9));
				stu.setStatus(rs.getString(10));
				stu.setBorndate(rs.getString(11));
				stu.setCountry(rs.getString(12));
				stu.setNatived(rs.getString(13));
				stu.setNation(rs.getString(14));
				stu.setPoliticsstatus(rs.getString(15));
				stu.setStutime(rs.getString(16));
				stu.setMajor(rs.getString(17));
				stu.setClassnum(rs.getString(18));
				stu.setClassid(rs.getString(19));
				stu.setBeforeid(rs.getString(20));
				stu.setForlang(rs.getString(21));
				stuMap.add(stu);
			}
			return stuMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//find student

	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
}
