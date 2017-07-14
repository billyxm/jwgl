package jwgl.model;

public class HaveCourse {
	private int id;
	private String sno;
	private String cno;
	private String cname;
	private String tname;
	private String chour;
	private String examway;
	private String classtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getChour() {
		return chour;
	}
	public void setChour(String chour) {
		this.chour = chour;
	}
	public String getExamway() {
		return examway;
	}
	public void setExamway(String examway) {
		this.examway = examway;
	}
	public String getClasstime() {
		return classtime;
	}
	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}
	@Override
	public String toString() {
		return "HaveCourse [id=" + id + ", sno=" + sno + ", cno=" + cno
				+ ", cname=" + cname + ", tname=" + tname + ", chour=" + chour
				+ ", examway=" + examway + ", classtime=" + classtime + "]";
	}
	
}
