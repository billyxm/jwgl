package jwgl.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import jwgl.model.Course;
import jwgl.util.DB;

public class CourseDao {
	//获取课程
	public List<Course> getCourse(){
		List<Course> couMap = new ArrayList<Course>();
		try {
			Connection conn = DB.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM course";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Course cou = new Course();
				cou.setId(rs.getInt(1));
				cou.setCno(rs.getString(2));
				cou.setCname(rs.getString(3));
				cou.setChour(rs.getString(4));
				cou.setCredit(rs.getString(5));
				cou.setBegin(rs.getString(6));
				cou.setEnd(rs.getString(7));
				cou.setPress(rs.getString(8));
				cou.setAuthor(rs.getString(9));
				cou.setExamway(rs.getString(10));
				couMap.add(cou);
			}
			return couMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//增加课程
	public boolean addCourse(Course cou){
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql = "insert into course(cno,cname,chour,credit,begin,end,press,author,examway) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ptemt =  conn.prepareStatement(sql);
			ptemt.setString(1, cou.getCno());
			ptemt.setString(2, cou.getCname());
			ptemt.setString(3, cou.getChour());
			ptemt.setString(4, cou.getCredit());
			ptemt.setString(5, cou.getBegin());
			ptemt.setString(6, cou.getEnd());
			ptemt.setString(7, cou.getPress());
			ptemt.setString(8, cou.getAuthor());
			ptemt.setString(9, cou.getExamway());
			System.out.println(cou.getCno());
			result = ptemt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	//删除课程
	public boolean delCourse(Course cou){
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql = "delete from course where id = ? ";
			PreparedStatement ptemt =  conn.prepareStatement(sql);
			ptemt.setInt(1, cou.getId());
			result = ptemt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	//更改课程
	public boolean modifyCourse(Course cou){
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql = "update  course set cno=?,cname=?,chour=?,credit=?,begin=?,end=?,press=?,author=?,examway=? where id = ?";
			PreparedStatement ptemt =  conn.prepareStatement(sql);
			ptemt.setString(1, cou.getCno());
			ptemt.setString(2, cou.getCname());
			ptemt.setString(3, cou.getChour());
			ptemt.setString(4, cou.getCredit());
			ptemt.setString(5, cou.getBegin());
			ptemt.setString(6, cou.getEnd());
			ptemt.setString(7, cou.getPress());
			ptemt.setString(8, cou.getAuthor());
			ptemt.setString(9, cou.getExamway());
			ptemt.setInt(10, cou.getId());
			result = ptemt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	//查找课程
	public List<Course> findCourse(Course cou){
		List<Course> couFindMap = new ArrayList<Course>();
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM course where cname=?";
			PreparedStatement ptemt =  conn.prepareStatement(sql);
			ptemt.setString(1, cou.getCname());
			System.out.println(cou.getCname());
			ResultSet rs = ptemt.executeQuery();
			while(rs.next()){
				
				cou.setId(rs.getInt(1));
				cou.setCno(rs.getString(2));
				cou.setCname(rs.getString(3));
				cou.setChour(rs.getString(4));
				cou.setCredit(rs.getString(5));
				cou.setBegin(rs.getString(6));
				cou.setEnd(rs.getString(7));
				cou.setPress(rs.getString(8));
				cou.setAuthor(rs.getString(9));
				cou.setExamway(rs.getString(10));
				couFindMap.add(cou);}
			return couFindMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
