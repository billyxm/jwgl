package jwgl.action;

import java.util.List;

import jwgl.Dao.CourseSelectDao;
import jwgl.model.CourseSelect;

public class CourseSelectAction {
	private CourseSelect cst;
	private CourseSelectDao csdo = new CourseSelectDao();
	private List<CourseSelect> cstList;
	public CourseSelect getCst() {
		return cst;
	}
	public void setCst(CourseSelect cst) {
		this.cst = cst;
	}
	public CourseSelectDao getCsdo() {
		return csdo;
	}
	public void setCsdo(CourseSelectDao csdo) {
		this.csdo = csdo;
	}
	public List<CourseSelect> getCstList() {
		return cstList;
	}
	public void setCstList(List<CourseSelect> cstList) {
		this.cstList = cstList;
	}
	//get all courseSelect
	public String getCsAll(){
		cstList = csdo.getCourseSelect();
		return "querysuccess";
	}
	//save
	public String save(){
		csdo.addCourseSelect(cst);
		System.out.println("csdo");
		return "success";
	}
	//delete
	public String delete(){
		csdo.delCourseSelect(cst);
		System.out.println("csdo");
		return "success";
	}
	//modify
	public String modify(){
		csdo.modifyCourseSelect(cst);
		System.out.println(csdo);
		return "success";
	}
	//find
	public String find(){
		cstList = csdo.findCoureSelect(cst);
		System.out.println(cstList);
		return "ok";
	}
}
