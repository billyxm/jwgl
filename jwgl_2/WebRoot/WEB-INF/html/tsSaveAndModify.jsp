<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<!-- start -->
    <s:if test="#parameters.id==null">
    	<s:form action="teachTask-save" target="_parent">
    		<s:hidden name="cs.id" label="id"></s:hidden>
    		<s:textfield name="cs.year" label="year"></s:textfield>
    		<s:textfield name="cs.term" label="term"></s:textfield>
    		<s:textfield name="cs.classnum" label="classnum"></s:textfield>
    		<s:textfield name="cs.cname" label="cname"></s:textfield>
    		<s:textfield name="cs.tname" label="tname"></s:textfield>
    		<s:textfield name="cs.chour" label="chour"></s:textfield>
    		<s:textfield name="cs.begin" label="begin"></s:textfield>
    		<s:textfield name="cs.end" label="end"></s:textfield>
    		<s:textfield name="cs.examway" label="examway"></s:textfield>
    		<s:textfield name="cs.classsite" label="classsite"></s:textfield>
    		<s:textfield name="cs.classtime" label="classtime"></s:textfield>
    		<s:textfield name="cs.examtime" label="examtime"></s:textfield>	
    		<s:submit value="提交" />
    	</s:form>
    </s:if>
    <s:else>
    	<form action="teaTask-modify" method="post" target="_parent">
    		<table>
	<tbody>
		<tr>
			<td>学年：<input type="text" name="cs.year" value="${param.year}">
			<input type="hidden" name="cs.id" value="${param.id}" ></td>
			
		</tr>
		<tr>
			<td>学期：<input type="text" name="cs.term" value="${param.term}"></td>
		</tr>
		<tr>
			<td>班级：<input type="text" name="cs.classnum" value="${param.classnum}"></td>
		</tr>
		<tr>
			<td>课程名称：<input type="text" name="cs.cname" value="${param.cname}"></td>
		</tr>
		<tr>
			<td>教师名称：<input type="text" name="cs.tname" value="${param.tname}"></td>
		</tr>
		<tr>
			<td>课时：<input type="text" name="cs.chour" value="${param.chour}"></td>
		</tr>
		<tr>
			<td>开课时间：<input type="text" name="cs.begin" value="${param.begin}"></td>
		</tr>
		<tr>
			<td>结课时间：<input type="text" name="cs.end" value="${param.end}"></td>
		</tr>
		<tr>
			<td>考试方式：<input type="text" name="cs.examway" value="${param.examway}"></td>
		</tr>
		<tr>
			<td>上课地点：<input type="text" name="cs.classsite" value="${param.classsite}"></td>
		</tr>
		<tr>
			<td>上课时间：<input type="text" name="cs.classtime" value="${param.classtime}"></td>
		</tr>
		<tr>
			<td>考试时间：<input type="text" name="cs.examtime" value="${param.examtime}"></td>
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