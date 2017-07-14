package jwgl.action.teacher;

import jwgl.Dao.teacher.GradeTeaDao;
import jwgl.model.Grade;

public class GradeAtion {
	private Grade ga;
	private GradeTeaDao gtdo = new GradeTeaDao();
	//
	public String save(){
		gtdo.addGrade(ga);
		return "ok";
	}
	//
	public String in(){
		return "success";
	}
	public Grade getGa() {
		return ga;
	}
	public void setGa(Grade ga) {
		this.ga = ga;
	}
	public GradeTeaDao getGtdo() {
		return gtdo;
	}
	public void setGtdo(GradeTeaDao gtdo) {
		this.gtdo = gtdo;
	}
	
	
}
