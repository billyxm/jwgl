package jwgl.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jwgl.model.TeachTask;
import jwgl.util.DB;

public class TeachTaskDao {
	//返回所有教学计划
	public List<TeachTask> getTs(){
		List<TeachTask> csMap = new ArrayList<TeachTask>();
		try {
			Connection conn = DB.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM course_schedule";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				TeachTask cs = new TeachTask();
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
				csMap.add(cs);
			}
			System.out.println(csMap);
			return csMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//增加
	public boolean addTs(TeachTask cs){
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql="Insert into course_schedule (year,term,classnum,cname,tname,chour,begin,end,examway,classsite,classtime,examtime) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cs.getYear());
			ps.setString(2, cs.getTerm());
			ps.setString(3, cs.getClassnum());
			ps.setString(4,cs.getCname());
			ps.setString(5, cs.getTname());
			ps.setString(6, cs.getChour());
			ps.setString(7, cs.getBegin());
			ps.setString(8, cs.getEnd());
			ps.setString(9, cs.getExamway());
			ps.setString(10, cs.getClasssite());
			ps.setString(11, cs.getClasstime());
			ps.setString(12, cs.getExamtime());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
//删除
	public boolean delTs(TeachTask cs){
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "Delete from course_schedule where tname = ?";
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, cs.getTname());
			result = ps.executeUpdate();
			System.out.println(sql+cs.getTname());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
//更改
	public boolean modifyTs(TeachTask cs){
		int result = 0;
		try {
			Connection conn = DB.getConnection();
			String sql = "UPDATE course_schedule Set year=?,term=?,classnum=?,cname=?,tname=?,chour=?,begin=?,end=?,examway=?,classsite=?,classtime=?,examtime=?  WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cs.getYear());
			ps.setString(2, cs.getTerm());
			ps.setString(3, cs.getClassnum());
			ps.setString(4,cs.getCname());
			ps.setString(5, cs.getTname());
			ps.setString(6, cs.getChour());
			ps.setString(7, cs.getBegin());
			ps.setString(8, cs.getEnd());
			ps.setString(9, cs.getExamway());
			ps.setString(10, cs.getClasssite());
			ps.setString(11, cs.getClasstime());
			ps.setString(12, cs.getExamtime());
			ps.setInt(13, cs.getId());
			result = ps.executeUpdate();
			System.out.println(cs.getId()+"已删除");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true:false;
	}
	//查找
	public List<TeachTask> findTs(TeachTask cs){
		List<TeachTask> csFindMap = new ArrayList<TeachTask>();
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM course_schedule where tname=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, cs.getTname());
			System.out.println(cs.getTname());
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
				csFindMap.add(cs);
			}
			return csFindMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
