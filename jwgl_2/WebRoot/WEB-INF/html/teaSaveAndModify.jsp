<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  <!-- start -->
    <s:if test="#parameters.id==null">
    	<s:form action="teacher-save" target="_parent">
    		<s:hidden name="tea.id" label="id"></s:hidden>
    		<s:textfield name="tea.tno" label="tno"></s:textfield>
    		<s:textfield name="tea.tname" label="tname"></s:textfield>
    		<s:textfield name="tea.tsex" label="tsex"></s:textfield>
    		<s:textfield name="tea.borndate" label="borndate"></s:textfield>
    		<s:textfield name="tea.tel" label="tel"></s:textfield>
    		<s:textfield name="tea.email" label="email"></s:textfield>
    		<s:textfield name="tea.college" label="college"></s:textfield>
    		<s:textfield name="tea.department" label="department"></s:textfield>
    		<s:textfield name="tea.education" label="education"></s:textfield>
    		<s:textfield name="tea.professional" label="professional"></s:textfield>
    		<s:textfield name="tea.direction" label="direction"></s:textfield>
    		<s:textfield name="tea.gradpro" label="gradpro"></s:textfield>
    		<s:textfield name="tea.gradschool" label="gradschool"></s:textfield>
    		<s:textfield name="tea.brief" label="brief"></s:textfield>
    		<s:textfield name="tea.indate" label="indate"></s:textfield>
    		<s:textfield name="tea.tpassword" label="tpassword"></s:textfield>
    		<s:submit value="提交" />
    	</s:form>
    </s:if>
    <s:else>
    	<form action="teacher-modify" method="post" target="_parent">
    		<table>
	<tbody>
		<tr>
			<td>工号：<input type="text" name="tea.tno" value="${param.tno}">
			<input type="hidden" name="tea.id" value="${param.id}" ></td>
			
		</tr>
		<tr>
			<td>姓名：<input type="text" name="tea.tname" value="${param.tname}"></td>
		</tr>
		<tr>
			<td>性别：<input type="text" name="tea.tsex" value="${param.tsex}"></td>
		</tr>
		<tr>
			<td>出生年月日：<input type="text" name="tea.borndate" value="${param.borndate}"></td>
		</tr>
		<tr>
			<td>联系电话：<input type="text" name="tea.tel" value="${param.tel}"></td>
		</tr>
		<tr>
			<td>Email：<input type="text" name="tea.email" value="${param.email}"></td>
		</tr>
		<tr>
			<td>学院：<input type="text" name="tea.college" value="${param.college}"></td>
		</tr>
		<tr>
			<td>系部：<input type="text" name="tea.department" value="${param.department}"></td>
		</tr>
		<tr>
			<td>学历：<input type="text" name="tea.education" value="${param.education}"></td>
		</tr>
		<tr>
			<td>职称：<input type="text" name="tea.professional" value="${param.professional}"></td>
		</tr>
		<tr>
			<td>研究方向：<input type="text" name="tea.direction" value="${param.direction}"></td>
		</tr>
		<tr>
			<td>毕业专业：<input type="text" name="tea.gradpro" value="${param.gradpro}"></td>
		</tr>
		<tr>
			<td>毕业学校：<input type="text" name="tea.gradschool" value="${param.gradschool}"></td>
		</tr>
		<tr>
			<td>简介：<input type="text" name="tea.brief" value="${param.brief}"></td>
		</tr>
		<tr>
			<td>创建时间：<input type="text" name="tea.indate" value="${param.indate}"></td>
		</tr>
		<tr>
			<td>登录密码：<input type="text" name="tea.tpassword" value="${param.tpassword}"></td>
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
