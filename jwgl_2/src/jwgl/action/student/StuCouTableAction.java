package jwgl.action.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import jwgl.model.TimeTable;
import jwgl.util.DB;


public class StuCouTableAction {
	private TimeTable ti = new TimeTable();
	
	public String all(){
		PreparedStatement ps = null;
		Map<String,Object> session = null;
		session = ActionContext.getContext().getSession();
		try {
			Connection conn = DB.getConnection();
			String sql="select M1,M2,M3,M4,M5,TU1,TU2,TU3,TU4,TU5,W1,W2,W3,W4,W5,TH1,TH2,TH3,TH4,TH5,F1,F2,F3,F4,F5 from timetable where sno=?";
			ps = conn.prepareStatement(sql);
			String sno = (String)session.get("sno");
			ps.setString(1,sno);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ti.setM1(rs.getString(1));
				ti.setM2(rs.getString(2));
				ti.setM3(rs.getString(3));
				ti.setM4(rs.getString(4));
				ti.setM5(rs.getString(5));
				ti.setTu1(rs.getString(6));
				ti.setTu2(rs.getString(7));
				ti.setTu3(rs.getString(8));
				ti.setTu4(rs.getString(9));
				ti.setTu5(rs.getString(10));
				ti.setW1(rs.getString(11));
				ti.setW2(rs.getString(12));
				ti.setW3(rs.getString(13));
				ti.setW4(rs.getString(14));
				ti.setW5(rs.getString(15));
				ti.setTh1(rs.getString(16));
				ti.setTh2(rs.getString(17));
				ti.setTh3(rs.getString(18));
				ti.setTh4(rs.getString(19));
				ti.setTh5(rs.getString(20));
				ti.setF1(rs.getString(21));
				ti.setF2(rs.getString(22));
				ti.setF3(rs.getString(23));
				ti.setF4(rs.getString(24));
				ti.setF5(rs.getString(25));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	public TimeTable getTi() {
		return ti;
	}

	public void setTi(TimeTable ti) {
		this.ti = ti;
	}
	
}
