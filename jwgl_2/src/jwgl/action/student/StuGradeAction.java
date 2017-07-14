package jwgl.action.student;

import java.util.List;

import jwgl.Dao.student.StuGradeDao;
import jwgl.model.Grade;

public class StuGradeAction {
	private Grade ga;
	private StuGradeDao sgdo = new StuGradeDao();
	private List<Grade> gradeList;
	
	public String getGrade(){
		gradeList =sgdo.getGrade();
		System.out.println(gradeList);
		return "querysuccess";
	}
	public Grade getGa() {
		return ga;
	}
	public void setGa(Grade ga) {
		this.ga = ga;
	}
	public StuGradeDao getSgdo() {
		return sgdo;
	}
	public void setSgdo(StuGradeDao sgdo) {
		this.sgdo = sgdo;
	}
	public List<Grade> getGradeList() {
		return gradeList;
	}
	public void setGardeList(List<Grade> gradeList) {
		this.gradeList = gradeList;
	}
	
}
