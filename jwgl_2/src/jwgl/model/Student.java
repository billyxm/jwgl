package jwgl.model;

public class Student {
	private int id;
	private String sno;
	private String sname;
	private String pinyin;
	private String ssex;
	private String beforename;
	private String engname;
	private String idtype;
	private String idnum;
	private String status;
	private String borndate;
	private String country;
	private String natived;
	private String nation;
	private String politicsstatus;
	private String stutime;
	private String major;
	private String classnum;
	private String classid;
	private String beforeid;
	private String forlang;
	private String password;
	
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
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPinyin() {
		return pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getBeforename() {
		return beforename;
	}
	public void setBeforename(String beforename) {
		this.beforename = beforename;
	}
	public String getEngname() {
		return engname;
	}
	public void setEngname(String engname) {
		this.engname = engname;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBorndate() {
		return borndate;
	}
	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNatived() {
		return natived;
	}
	public void setNatived(String natived) {
		this.natived = natived;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getPoliticsstatus() {
		return politicsstatus;
	}
	public void setPoliticsstatus(String politicsstatus) {
		this.politicsstatus = politicsstatus;
	}
	public String getStutime() {
		return stutime;
	}
	public void setStutime(String stutime) {
		this.stutime = stutime;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassnum() {
		return classnum;
	}
	public void setClassnum(String classnum) {
		this.classnum = classnum;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getBeforeid() {
		return beforeid;
	}
	public void setBeforeid(String beforeid) {
		this.beforeid = beforeid;
	}
	public String getForlang() {
		return forlang;
	}
	public void setForlang(String forlang) {
		this.forlang = forlang;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sno=" + sno + ", sname=" + sname
				+ ", pinyin=" + pinyin + ", ssex=" + ssex + ", beforename="
				+ beforename + ", engname=" + engname + ", idtype=" + idtype
				+ ", idnum=" + idnum + ", status=" + status + ", borndate="
				+ borndate + ", country=" + country + ", natived=" + natived
				+ ", nation=" + nation + ", politicsstatus=" + politicsstatus
				+ ", stutime=" + stutime + ", major=" + major + ", classnum="
				+ classnum + ", classid=" + classid + ", beforeid=" + beforeid
				+ ", forlang=" + forlang + ", password=" + password + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sno, String sname, String pinyin,
			String ssex, String beforename, String engname, String idtype,
			String idnum, String status, String borndate, String country,
			String natived, String nation, String politicsstatus,
			String stutime, String major, String classnum, String classid,
			String beforeid, String forlang, String password) {
		super();
		this.id = id;
		this.sno = sno;
		this.sname = sname;
		this.pinyin = pinyin;
		this.ssex = ssex;
		this.beforename = beforename;
		this.engname = engname;
		this.idtype = idtype;
		this.idnum = idnum;
		this.status = status;
		this.borndate = borndate;
		this.country = country;
		this.natived = natived;
		this.nation = nation;
		this.politicsstatus = politicsstatus;
		this.stutime = stutime;
		this.major = major;
		this.classnum = classnum;
		this.classid = classid;
		this.beforeid = beforeid;
		this.forlang = forlang;
		this.password = password;
	}
	
	
}
