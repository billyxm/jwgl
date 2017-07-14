2017/4/10下午遗留问题
(1)、session值没有在退出的时候清除
<<<已经解决

(2)、非登录用户问题
<<<已经解决 http://blog.csdn.net/markzwei/article/details/6305812
缺点：
	必须每一个包里面加入拦截器
	
	package里元素必须按照一定的顺序排列：

	result-types
	interceptors
	default-interceptor-ref
	default-action-ref
	default-class-ref
	global-results
	global-exception-mappings
	action*（所有action放到最后）
	！！记得某些页面要拦截才加！！！
2017/4/10晚遗留问题
(1)、其他页面的退出未设置
已解决
2017/4/12遗留的问题
jqGrid遗留的问题是用户
		多个用户同事
 <tr>
				    <th></th>
				    <th>工号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>出生日期</th>
                    <th>联系电话</th>
                    <th>Email</th>
                    <th>学院</th>
                    <th>系别</th>
                    <th>学历</th>
                    <th>职称</th>
                    <th>学科方向</th>
                    <th>毕业专业</th>
                    <th>毕业学校</th>
                    <th>教师简介</th>
                    <th>创建时间</th>
				        </tr>
    				Teacher tea = new Teacher();
		        	tea.setId(rs.getInt("id"));
		        	tea.setTno(rs.getString("tno"));
		        	tea.setTname(rs.getString("tname"));
		        	tea.setTsex(rs.getString("borndate"));
		        	tea.setBorndate(rs.getString("tel"));
		        	tea.setEmail(rs.getString("email"));
		        	tea.setCollege(rs.getString("college"));
		        	tea.setDeparment(rs.getString("department"));
		        	tea.setEducation(rs.getString("education"));
		        	tea.setProfessional(rs.getString("professional"));
		        	tea.setDirection(rs.getString("direction"));
		        	tea.setGradpro(rs.getString("gradpro"));
		        	tea.setGradschool(rs.getString("gradschool"));
		        	tea.setBrief(rs.getString("biref"));
		        	tea.setIndate(rs.getString("indate"));
		        	
		        	private int id;
	
	
id=${id}&sno=${sno}&sname=${sname}&pinyin=${pinyin}&ssex=${ssex}&
				beforename=${beforename}&engname=${engname}&idtype=${idtype}&idnum=${idnum}&status=${status}&borndate=${borndate}&country=${country}&natived=${natived}&nation=${nation}&politicsstatus=${politicsstatus}&stutime=${stutime}&major=${major}&classnum=${classnum}&classid=${classid}&beforeid=${beforeid}&forland=${forland}&password=${password}
				
				
				private Map<String, Object> stuMap;
		
		public void viewStudent() throws SQLException{
			
			try{
			Connection conn=DB.getConnection();
			Statement stmt = conn.createStatement(); 
			String sql="SELECT * FROM student";   
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while(rs.next()){
				 stuMap.put("id", rs.getInt(1));
				stuMap.put("sno", rs.getString(2));
				stuMap.put("sname", rs.getString(3));
				stuMap.put("pinyin", rs.getString(4));
				stuMap.put("ssex", rs.getString(5));
				stuMap.put("beforename", rs.getString(6));
				stuMap.put("engname", rs.getString(7));
				stuMap.put("idtype", rs.getString(8));
				stuMap.put("idnum", rs.getString(9));
				stuMap.put("status", rs.getString(10));
				stuMap.put("borndate", rs.getString(11));
				stuMap.put("country", rs.getString(12));
				stuMap.put("natived", rs.getString(13));
				stuMap.put("nation", rs.getString(14));
				stuMap.put("politicsstatus", rs.getString(15));
				stuMap.put("stutime", rs.getString(16));
				stuMap.put("major", rs.getString(17));
				stuMap.put("classnum", rs.getString(18));
				stuMap.put("classid", rs.getString(19));
				stuMap.put("beforid", rs.getString(20));
				stuMap.put("forlang", rs.getString(21));
				stuMap.put("password", rs.getString(22));
			
			}
            stmt.close();
            
		
			}catch (Exception e) {
			   // TODO Auto-generated catch block   
			   e.printStackTrace();
			  }
		}	