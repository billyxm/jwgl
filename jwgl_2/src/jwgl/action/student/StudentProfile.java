package jwgl.action.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.Student;
import jwgl.util.DB;

public class StudentProfile {
	private Student stu = new Student();
	
	//
	public String all(){
		PreparedStatement ps = null;
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT sno,sname,pinyin,ssex,beforename,engname,idtype,idnum,status,borndate,country,natived,nation,politicsstatus,stutime,major,classnum,classid,beforeid,forlang FROM student where sname=?";
			ps = conn.prepareStatement(sql);
			String sname = (String)session.get("sname");
			ps.setString(1,sname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){				
				stu.setSno(rs.getString(1));
				stu.setSname(rs.getString(2));
				stu.setPinyin(rs.getString(3));
				stu.setSsex(rs.getString(4));
				stu.setBeforename(rs.getString(5));
				stu.setEngname(rs.getString(6));
				stu.setIdtype(rs.getString(7));
				stu.setIdnum(rs.getString(8));
				stu.setStatus(rs.getString(9));
				stu.setBorndate(rs.getString(10));
				stu.setCountry(rs.getString(11));
				stu.setNatived(rs.getString(12));
				stu.setNation(rs.getString(13));
				stu.setPoliticsstatus(rs.getString(14));
				stu.setStutime(rs.getString(15));
				stu.setMajor(rs.getString(16));
				stu.setClassnum(rs.getString(17));
				stu.setClassid(rs.getString(18));
				stu.setBeforeid(rs.getString(19));
				stu.setForlang(rs.getString(20));
			}		
		}catch (Exception e) {
				e.printStackTrace();
			}
		return "success";
	}
	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}
