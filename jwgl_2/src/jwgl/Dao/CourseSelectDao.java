package jwgl.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jwgl.model.CourseSelect;
import jwgl.util.DB;

public class CourseSelectDao {
	//get all
	public List<CourseSelect> getCourseSelect(){
		List<CourseSelect> csList = new ArrayList<CourseSelect>();
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
				csList.add(cst);
			}
			return csList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//add
	public boolean addCourseSelect(CourseSelect cst) {
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql="Insert into course_select(cno,cname,tname,chour,examway) values(?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cst.getCno());
			ps.setString(2, cst.getCname());
			ps.setString(3, cst.getTname());
			ps.setString(4, cst.getChour());
			ps.setString(5, cst.getExamway());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	//delete
	public boolean delCourseSelect(CourseSelect cst){
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "Delete from course_select where cno = ?";
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, cst.getCno());
			result = ps.executeUpdate();
			System.out.println(sql+cst.getCno());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	//modify
	public boolean modifyCourseSelect(CourseSelect cst){
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql =  "Update course_select Set cno=?,cname=?, tname=?, chour=?, examway=? Where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cst.getCno());
			ps.setString(2, cst.getCname());
			ps.setString(3, cst.getTname());
			ps.setString(4, cst.getChour());
			ps.setString(5, cst.getExamway());
			ps.setInt(6, cst.getId());
			result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0?true:false;
	}
	//find
	public List<CourseSelect> findCoureSelect(CourseSelect cst){
		List<CourseSelect> cstFindMap = new ArrayList<CourseSelect>();
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM course_select where cname=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, cst.getCname());
			System.out.println(cst.getCname());
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				cst.setId(rs.getInt(1));
				cst.setCno(rs.getString(2));
				cst.setCname(rs.getString(3));
				cst.setTname(rs.getString(4));
				cst.setChour(rs.getString(5));
				cst.setExamway(rs.getString(6));
				cstFindMap.add(cst);
			}
			return cstFindMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
