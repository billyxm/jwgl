<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
		 <body>
  <!-- start -->
    <s:if test="#parameters.id==null">
    	<s:form action="course-save" target="_parent">
    		<s:hidden name="cou.id" label="id"></s:hidden>
    		<s:textfield name="cou.cno" label="课程编号"></s:textfield>
    		<s:textfield name="cou.cname" label="课程名称"></s:textfield>
    		<s:textfield name="cou.chour" label="学时"></s:textfield>
    		<s:textfield name="cou.credit" label="学分"></s:textfield>
    		<s:textfield name="cou.begin" label="开课时间"></s:textfield>
    		<s:textfield name="cou.end" label="结课时间"></s:textfield>
    		<s:textfield name="cou.press" label="出版社"></s:textfield>
    		<s:textfield name="cou.author" label="作者"></s:textfield>
    		<s:textfield name="cou.examway" label="考试方式"></s:textfield>
    		<s:submit value="提交" />
    	</s:form>
    </s:if>
    <s:else>
    	<form action="course-modifty" method="post" target="_parent">
    		<table>
	<tbody>
		<tr>
			<td>课程编号：<input type="text" name="cou.cno" value="${param.cno}">
			<input type="hidden" name="cou.id" value="${param.id}" ></td>
			
		</tr>
		<tr>
			<td>课程名称：<input type="text" name="cou.cname" value="${param.cname}"></td>
		</tr>
		<tr>
			<td>学时：<input type="text" name="cou.chour" value="${param.chour}"></td>
		</tr>
		<tr>
			<td>学分<input type="text" name="cou.credit" value="${param.credit}"></td>
		</tr>
		<tr>
			<td>开课时间：<input type="text" name="cou.begin" value="${param.begin}"></td>
		</tr>
		<tr>
			<td>结课时间:<input type="text" name="cou.end" value="${param.end}"></td>
		</tr>
		<tr>
			<td>出版社<input type="text" name="cou.press" value="${param.press}"></td>
		</tr>
		<tr>
			<td>作者<input type="text" name="cou.author" value="${param.author}"></td>
		</tr>
		<tr>
			<td>考试方式:<input type="text" name="cou.examway" value="${param.examway}"></td>
		</tr>
		<tr>
		<td><s:submit value="提交" /></td></tr>
	</tbody>
</table>
    	</form>
    </s:else>
    <!-- End -->
</body>
</html>