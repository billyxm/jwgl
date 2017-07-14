package jwgl.action;

import java.util.List;

import jwgl.Dao.TeacherDao;
import jwgl.model.Teacher;
/**
 * @author Billy  TeacherAction类继承父类BaseAction
 * 
 * */
public class TeacherAction extends BaseAction {
	private Teacher tea;
	private TeacherDao tdo = new TeacherDao();
	private List<Teacher> teacherList;
	public Teacher getTea() {
		return tea;
	}
	public void setTea(Teacher tea) {
		this.tea = tea;
	}
	// 调用TeachertDao类中的方法获取所有数据
	public String getTeacher() {
		teacherList = tdo.getTeacher();
		return "querysuccess";
	}
	// 调用StudentDao类中的方法保存数据
		public String save() {
			tdo.addTeacher(tea);
			return "success";
		}
		// 调用StudentDao类中的方法删除数据
		public String delete() {
			tdo.delTeacher(tea);
			return "success";
		}
		// 调用StudentDao类中的方法修改数据
		public String modify() {
			System.out.println(tea.toString());
			tdo.modifyTeacher(tea);
			return "success";
		}
		// 调用StudentDao类中的方法查找数据
		public String find() {
			TeacherDao teacherDao = new TeacherDao();
			teacherList = teacherDao.findTeacher(tea);

			System.out.println(teacherList);
			return "ok";
		}
	//自动生成的setter和getter的方法
	
	public TeacherDao getTdo() {
		return tdo;
	}
	public void setTdo(TeacherDao tdo) {
		this.tdo = tdo;
	}
	public List<Teacher> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	

}
