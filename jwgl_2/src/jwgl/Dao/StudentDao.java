package jwgl.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jwgl.model.Student;
import jwgl.util.DB;

public class StudentDao {

	// 定义Map对象作为模拟数据库数据来源

	// private List stuMap;
	// Q获取全部数据

	public List<Student> getStudent() {
		List<Student> stuMap = new ArrayList<Student>();
		try {
			Connection conn = DB.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(sql);

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
				stu.setPassword(rs.getString(22));
				stuMap.add(stu);
			}
			return stuMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// C添加数据
	public boolean addStudent(Student stu) {
		int result = 0;
		// stuMap.put("id", emp);
		try {
			Connection conn = DB.getConnection();

			String sql = "insert into student(sno, sname, pinyin, ssex, beforename, engname, idtype, idnum, status, borndate, country, natived, nation, politicsstatus, stutime, major, classnum, classid, beforeid, forlang, password) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getSno());
			ps.setString(2, stu.getSname());
			ps.setString(3, stu.getPinyin());
			ps.setString(4, stu.getSsex());
			ps.setString(5, stu.getBeforename());
			ps.setString(6, stu.getEngname());
			ps.setString(7, stu.getIdtype());
			ps.setString(8, stu.getIdnum());
			ps.setString(9, stu.getStatus());
			ps.setString(10, stu.getBorndate());
			ps.setString(11, stu.getCountry());
			ps.setString(12, stu.getNatived());
			ps.setString(13, stu.getNation());
			ps.setString(14, stu.getPoliticsstatus());
			ps.setString(15, stu.getStutime());
			ps.setString(16, stu.getMajor());
			ps.setString(17, stu.getClassnum());
			ps.setString(18, stu.getClassid());
			ps.setString(19, stu.getBeforeid());
			ps.setString(20, stu.getForlang());
			ps.setString(21, stu.getPassword());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}

	// D删除数据
	public boolean deleteStudent(Student stu) {
		// stuMap.remove(emp.getId());
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;

		String sql = "Delete from Student where id = ?";

		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, stu.getId());
			result = ps.executeUpdate();
			System.out.println(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result > 0 ? true : false;
	}

	// U修改数据
	public boolean modifyStudent(Student stu) {
		int result = 0;
		try {
			Connection conn = DB.getConnection();

			String sql = "Update Student Set sno=?, sname=?, pinyin=?, ssex=?, beforename=?, engname=?, idtype=?,idnum=?,status=?,borndate=?, country=?,natived=?,nation=?,politicsstatus=?,stutime=?,major=?,classnum=?,classid=?,beforeid=?,forlang=?,password=? Where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getSno());
			ps.setString(2, stu.getSname());
			ps.setString(3, stu.getPinyin());
			ps.setString(4, stu.getSsex());
			ps.setString(5, stu.getBeforename());
			ps.setString(6, stu.getEngname());
			ps.setString(7, stu.getIdtype());
			ps.setString(8, stu.getIdnum());
			ps.setString(9, stu.getStatus());
			ps.setString(10, stu.getBorndate());
			ps.setString(11, stu.getCountry());
			ps.setString(12, stu.getNatived());
			ps.setString(13, stu.getNation());
			ps.setString(14, stu.getPoliticsstatus());
			ps.setString(15, stu.getStutime());
			ps.setString(16, stu.getMajor());
			ps.setString(17, stu.getClassnum());
			ps.setString(18, stu.getClassid());
			ps.setString(19, stu.getBeforeid());
			ps.setString(20, stu.getForlang());
			ps.setString(21, stu.getPassword());
			ps.setInt(22, stu.getId());
			result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}

	public List<Student> findStudent(Student stu) {

		List<Student> stuFindMap = new ArrayList<Student>();
		PreparedStatement ps = null;
		try {
			Connection conn = DB.getConnection();
			String sql = "SELECT * FROM student where sname=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getSname());
			System.out.println(stu.getSname());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

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
				stu.setPassword(rs.getString(22));
				stuFindMap.add(stu);
			}
			return stuFindMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
