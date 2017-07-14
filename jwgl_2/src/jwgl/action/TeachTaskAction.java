package jwgl.action;

import java.util.List;

import jwgl.Dao.TeachTaskDao;
import jwgl.model.TeachTask;

public class TeachTaskAction {
	private TeachTask cs;
	private TeachTaskDao csdo = new TeachTaskDao();
	private List<TeachTask> csList;
	
	public TeachTask getCs() {
		return cs;
	}
	public void setCs(TeachTask cs) {
		this.cs = cs;
	}
	public TeachTaskDao getCsdo() {
		return csdo;
	}
	public void setCsdo(TeachTaskDao csdo) {
		this.csdo = csdo;
	}
	public List<TeachTask> getCsList() {
		return csList;
	}
	public void setCsList(List<TeachTask> csList) {
		this.csList = csList;
	}
	//start
	public String getTeachTask(){
		csList = csdo.getTs();
		return "querysuccess";
	}
	//save
	public String save(){
		csdo.addTs(cs);
		return "success";
	}
	//delete
	public String delete(){
		csdo.delTs(cs);
		return "success";
	}
	//modify
	public String modify(){
		csdo.modifyTs(cs);
		return "success";
	}
	//Find by teacher name
	public String find(){
		csList = csdo.findTs(cs);
		System.out.println(csList);
		return "ok";
	}
}
