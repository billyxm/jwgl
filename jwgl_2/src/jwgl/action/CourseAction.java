package jwgl.action;


import java.util.List;

import jwgl.Dao.CourseDao;
import jwgl.model.Course;
/**
 * @author Billy  CourseAction类继承父类BaseAction
 * 
 * */
public class CourseAction extends BaseAction{
	private Course cou;
	private CourseDao cdo = new CourseDao();
	private List<Course> courseList;
	
	// 调用CourseDao类中的方法获取所有数据
	public String getCourse() {
		courseList = cdo.getCourse();
		return "querysuccess";
	}
	// 调用CourseDao类中的方法保存数据
	
	public String save(){
		cdo.addCourse(cou);
		return "success";
	}
	// 调用CourseDao类中的方法删除数据
	public String delete(){
		cdo.delCourse(cou);
		return "success";
		}
	// 调用CourseDao类中的方法修改数据
	public String modifty(){
		cdo.modifyCourse(cou);
		return "success";
	}
	// 调用CourseDao类中的方法查找数据
	public String find(){
		CourseDao cd = new CourseDao();
		courseList = cd.findCourse(cou);
		System.out.println(courseList);
		return "ok";
	}
	//自动生成的setter和getter的方法
	public Course getCou() {
		return cou;
	}
	public void setCou(Course cou) {
		this.cou = cou;
	}
	public CourseDao getCdo() {
		return cdo;
	}
	public void setCdo(CourseDao cdo) {
		this.cdo = cdo;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
}
