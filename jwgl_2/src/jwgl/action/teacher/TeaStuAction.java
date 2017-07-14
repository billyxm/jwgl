package jwgl.action.teacher;

import java.util.List;

import jwgl.Dao.teacher.TeaStuDao;
import jwgl.model.Student;

public class TeaStuAction {
	private Student stu;
	private TeaStuDao tsdo = new TeaStuDao();
	private List<Student> stuList;
	
	//get stu
	public String getStudent(){
		stuList = tsdo.getStudent();
		return "querysuccess";
	}
	//find stu

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public TeaStuDao getTsdo() {
		return tsdo;
	}

	public void setTsdo(TeaStuDao tsdo) {
		this.tsdo = tsdo;
	}

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

}
