<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML>
<html>

<body>
	<s:if test="#parameters.id==null">
		<s:form action="student-save" target="_parent">
			<s:hidden name="stu.id" label="id"></s:hidden>
			<s:textfield name="stu.sno" label="sno"></s:textfield>
			<s:textfield name="stu.sname" label="sname"></s:textfield>
			<s:textfield name="stu.pinyin" label="pinyin"></s:textfield>
			<s:textfield name="stu.ssex" label="ssex"></s:textfield>
			<s:textfield name="stu.beforename" label="beforename"></s:textfield>
			<s:textfield name="stu.engname" label="engname"></s:textfield>
			<s:textfield name="stu.idtype" label="idtype"></s:textfield>
			<s:textfield name="stu.idnum" label="idnum"></s:textfield>
			<s:textfield name="stu.status" label="status"></s:textfield>
			<s:textfield name="stu.borndate" label="borndate"></s:textfield>
			<s:textfield name="stu.country" label="country"></s:textfield>
			<s:textfield name="stu.natived" label="natived"></s:textfield>
			<s:textfield name="stu.nation" label="nation"></s:textfield>
			<s:textfield name="stu.politicsstatus" label="politicsstatus"></s:textfield>
			<s:textfield name="stu.stutime" label="stutime"></s:textfield>
			<s:textfield name="stu.major" label="major"></s:textfield>
			<s:textfield name="stu.classnum" label="classnum"></s:textfield>
			<s:textfield name="stu.classid" label="classid"></s:textfield>
			<s:textfield name="stu.beforeid" label="beforeid"></s:textfield>
			<s:textfield name="stu.forlang" label="forlang"></s:textfield>
			<s:textfield name="stu.password" label="password"></s:textfield>
			<s:submit value="提交" />
		</s:form>
	</s:if>
	<s:else>

		<form action="student-modify" method="post" target="_parent">
			<table>
				<tr>
					<td>学号:<input type="text" name="stu.sno" value="${param.sno}">
						<input type="hidden" name="stu.id" value="${param.id}" />
					</td>
				</tr>
				<tr>
					<td>姓名:<input type="text" name="stu.sname"
						value="${param.sname}"></td>
				</tr>
				<tr>
					<td>拼音首字母:<input type="text" name="stu.pinyin"
						value="${param.pinyin}"></td>
				</tr>
				<tr>
					<td>性别:<input type="text" name="stu.ssex"
						value="${param.ssex}"></td>
				</tr>
				<tr>
					<td>曾用名:<input type="text" name="stu.beforename"
						value="${param.beforename}"></td>
				</tr>
				<tr>
					<td>英文名:<input type="text" name="stu.engname"
						value="${param.engname}"></td>
				</tr>
				<tr>
					<td>证件类型:<input type="text" name="stu.idtype"
						value="${param.idtype}"></td>
				</tr>
				<tr>
					<td>证件号码:<input type="text" name="stu.idnum"
						value="${param.idnum}"></td>
				</tr>
				<tr>
					<td>学籍状态:<input type="text" name="stu.status"
						value="${param.status}"></td>
				</tr>
				<tr>
					<td>出生年月日:<input type="text" name="stu.borndate"
						value="${param.borndate}"></td>
				</tr>
				<tr>
					<td>国家:<input type="text" name="stu.country"
						value="${param.country}"></td>
				</tr>
				<tr>
					<td>籍贯:<input type="text" name="stu.natived"
						value="${param.natived}"></td>
				</tr>
				<tr>
					<td>民族:<input type="text" name="stu.nation"
						value="${param.nation}"></td>
				</tr>
				<tr>
					<td>政治面貌:<input type="text" name="stu.politicsstatus"
						value="${param.politicsstatus}"></td>
				</tr>
				<tr>
					<td>学制:<input type="text" name="stu.stutime"
						value="${param.stutime}"></td>
				</tr>
				<tr>
					<td>专业:<input type="text" name="stu.major"
						value="${param.major}"></td>
				</tr>
				<tr>
					<td>班级：<input type="text" name="stu.classnum"
						value="${param.classnum}"></td>
				</tr>
				<tr>
					<td>班级班内序号:<input type="text" name="stu.classid"
						value="${param.classid}"></td>
				</tr>
				<tr>
					<td>原学号:<input type="text" name="stu.beforeid"
						value="${param.beforeid}"></td>
				</tr>
				<tr>
					<td>外语语种:<input type="text" name="stu.forlang"
						value="${param.forlang}"></td>
				</tr>
				<tr>
					<td>密码:<input type="text" name="stu.password"
						value="${param.password}"></td>
				</tr>


				<tr>
					<td><input type="submit" value="提交"></td>
				</tr>
			</table>

		</form>

	</s:else>
</body>
</html>
