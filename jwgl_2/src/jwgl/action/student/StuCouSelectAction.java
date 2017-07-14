package jwgl.action.student;

import java.util.ArrayList;
import java.util.List;

import jwgl.Dao.student.StuCouSelectDAO;
import jwgl.model.CourseSelect;
import jwgl.model.HaveCourse;

public class StuCouSelectAction {
		private CourseSelect cst;
		private HaveCourse cs;
		private StuCouSelectDAO sdo = new StuCouSelectDAO() ;
		private List<CourseSelect> cstList = new ArrayList<CourseSelect>();
		
		
		
		
		
		public String all(){
			 cstList =sdo.getcscher();
			return "success";
		}
		
		

		public String save(){
			sdo.addTeacher(cs);
			return "ok";
		}
		public CourseSelect getCst() {
			return cst;
		}
		public void setCst(CourseSelect cst) {
			this.cst = cst;
		}
		public HaveCourse getCs() {
			return cs;
		}
		public void setCs(HaveCourse cs) {
			this.cs = cs;
		}
		public StuCouSelectDAO getSdo() {
			return sdo;
		}
		public void setSdo(StuCouSelectDAO sdo) {
			this.sdo = sdo;
		}
		public List<CourseSelect> getCstList() {
			return cstList;
		}
		public void setCstList(List<CourseSelect> cstList) {
			this.cstList = cstList;
		}

		
		
}
