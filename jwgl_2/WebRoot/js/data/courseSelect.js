$(function() {
	//循环输出删除用户按钮
		$(".delete").each(function(i, e) {
			$(this).click(function() {
				if (confirm("是否要删除课程编号为" + e.lang + "的教师?")) {			
					window.location.href="cst-delete?cst.cno="+e.lang;
				}
			});
		});
		$(".modify").each(function(i, e) {
			$(this).click(function() {		
				//页面层
				layer.open({
				    type: 2,
				    title:'修改课程',
				    skin: 'layui-layer-rim', //加上边框
				    area: ['500px', '300px'], //宽高
				    content: "cstSaveAndModify?"+e.lang
				});
			});
		});
		$(".addCst").click(function(){
			//页面层
				layer.open({
				    type: 2,
				    title:'新增课程',
				   // skin: 'layui-layer-rim', //加上边框
				   	area: ['500px', '300px'], //宽高
				    content: "cstSaveAndModify"
				});	
			});
			
	});