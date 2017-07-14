package jwgl.action;

import java.util.List;

import jwgl.Dao.StudentDao;
import jwgl.model.Student;

/**
 * @author Billy StudentAction类继承父类BaseAction
 * 
 * */
public class StudentAction extends BaseAction {
	private Student stu;
	private StudentDao sd = new StudentDao();
	private List<Student> studentList;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	// 调用StudentDao类中的方法获取数据
	public String getStudent() {
		StudentDao studentDao = new StudentDao();
		studentList = studentDao.getStudent();
		
		return "querysuccess";
	}

	// 调用StudentDao类中的方法删除数据
	public String delete() {

		sd.deleteStudent(stu);
		return "success";
	}

	// 调用StudentDao类中的方法保存数据
	public String save() {
		sd.addStudent(stu);
		return "success";
	}

	// 调用StudentDao类中的方法修改数据
	public String modify() {
		System.out.println(stu.toString());
		sd.modifyStudent(stu);
		return "success";
	}
	// 调用StudentDao类中的方法查找数据
	public String find() {
		StudentDao studentDao = new StudentDao();

		studentList = studentDao.findStudent(stu);

		System.out.println(studentList);
		return "ok";
	}

	//
	public StudentDao getSd() {
		return sd;
	}

	public void setSd(StudentDao sd) {
		this.sd = sd;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
