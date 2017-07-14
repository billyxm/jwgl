package jwgl.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jwgl.util.DB;
import jwgl.model.Teacher;
public class TeacherDao {
	//返回所有教师的表格
	public List<Teacher> getTeacher(){
		List<Teacher> teaMap = new ArrayList<Teacher>();
		try {
			Connection conn = DB.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM teacher";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Teacher tea = new Teacher();
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
				teaMap.add(tea);
			}
			return teaMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//增加教师的方法
	public boolean addTeacher(Teacher tea){
		int result=0;
		try {
			Connection conn = DB.getConnection();
			String sql="Insert into teacher(tno, tname, tsex, borndate, tel, email, college,department,education,professional,direction,gradpro,gradschool,brief,indate,tpassword) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tea.getTno());
			ps.setString(2, tea.getTname());
			ps.setString(3, tea.getTsex());
			ps.setString(4, tea.getBorndate());
			ps.setString(5, tea.getTel());
			ps.setString(6, tea.getEmail());
			ps.setString(7, tea.getCollege());
			ps.setString(8, tea.getDepartment());
			ps.setString(9, tea.getEducation());
			ps.setString(10, tea.getProfessional());
			ps.setString(11, tea.getDirection());
			ps.setString(12, tea.getGradpro());
			ps.setString(13, tea.getGradschool());
			ps.setString(14, tea.getBrief());
			ps.setString(15, tea.getIndate());
			ps.setString(16, tea.getTpassword());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}
	//删除教师的方法
	public boolean delTeacher(Teacher tea){
		int result=0;
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "Delete from teacher where tno = ?";
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, tea.getTno());
			result = ps.executeUpdate();
			System.out.println(sql+tea.getTno());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}
	//更改教师的方法
	public boolean modifyTeacher(Teacher tea){
		int result=0;
		try {
			Connection conn = DB.getConnection();
			String sql =  "Update Teacher Set tno=?,tname=?, tsex=?, borndate=?, tel=?, email=?, college=?, department=?,education=?,professional=?,direction=?, gradpro=?,gradschool=?,brief=?,indate=?,tpassword=? Where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,tea.getTno());
			ps.setString(2, tea.getTname());
			ps.setString(3, tea.getTsex());
			ps.setString(4, tea.getBorndate());
			ps.setString(5, tea.getTel());
			ps.setString(6, tea.getEmail());
			ps.setString(7, tea.getCollege());
			ps.setString(8, tea.getDepartment());
			ps.setString(9, tea.getEducation());
			ps.setString(10, tea.getProfessional());
			ps.setString(11, tea.getDirection());
			ps.setString(12, tea.getGradpro());
			ps.setString(13, tea.getGradschool());
			ps.setString(14, tea.getBrief());
			ps.setString(15, tea.getIndate());
			ps.setString(16, tea.getTpassword());
			ps.setInt(17, tea.getId());
			result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}
	//查找教师的方法
	public List<Teacher> findTeacher(Teacher tea){
		List<Teacher> teaFindMap = new ArrayList<Teacher>();
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM teacher where tname=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, tea.getTname());
			System.out.println(tea.getTname());
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
				teaFindMap.add(tea);
			}
			return teaFindMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
