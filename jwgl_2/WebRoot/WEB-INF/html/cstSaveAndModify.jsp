<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
  <!-- start -->
    <s:if test="#parameters.id==null">
    	<s:form action="cst-save" target="_parent">
    		<s:hidden name="cst.id" label="id"></s:hidden>
    		<s:textfield name="cst.cno" label="课程编号"></s:textfield>
    		<s:textfield name="cst.cname" label="课程名称"></s:textfield>
    		<s:textfield name="cst.tname" label="任课老师"></s:textfield>
    		<s:textfield name="cst.chour" label="课时"></s:textfield>
    		<s:textfield name="cst.examway" label="考试方式"></s:textfield>
    		<s:submit value="提交" />
    	</s:form>
    </s:if>
    <s:else>
    	<form action="cst-modify" method="post" target="_parent">
    		<table>
	<tbody>
		<tr>
			<td>课程编号：<input type="text" name="cst.cno" value="${param.cno}">
			<input type="hidden" name="cst.id" value="${param.id}" ></td>
			
		</tr>
		<tr>
			<td>课程名称：<input type="text" name="cst.cname" value="${param.cname}"></td>
		</tr>
		<tr>
			<td>任课老师：<input type="text" name="cst.tname" value="${param.tname}"></td>
		</tr>
		<tr>
			<td>课时：<input type="text" name="cst.chour" value="${param.chour}"></td>
		</tr>
		<tr>
			<td>考试方式：<input type="text" name="cst.examway" value="${param.examway}"></td>
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