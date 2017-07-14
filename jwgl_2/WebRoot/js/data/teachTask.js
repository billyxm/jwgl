$(function() {
	//循环输出删除用户按钮
		$(".delete").each(function(i, e) {
			$(this).click(function() {
				if (confirm("是否要删除名称为" + e.lang + "的教师?")) {			
					window.location.href="teachTask-delete?cs.tname="+e.lang;
				}
			});
		});
		$(".modify").each(function(i, e) {
			$(this).click(function() {		
				//页面层
				layer.open({
				    type: 2,
				    title:'modify',
				    skin: 'layui-layer-rim', //加上边框
				    area: ['500px', '300px'], //宽高
				    content: "tsSaveAndModify?"+e.lang
				});
			});
		});
		$(".addTeachTask").click(function(){
			//页面层
				layer.open({
				    type: 2,
				    title:'addTeacher',
				   skin: 'layui-layer-rim', //加上边框
				   	area: ['500px', '300px'], //宽高
				    content: "tsSaveAndModify"
				});	
			});
			
	});