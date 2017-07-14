$(function() {
	//循环输出删除用户按钮
		$(".delete").each(function(i, e) {
			$(this).click(function() {
				if (confirm("是否要删除学号为" + e.lang + "的学生?")) {			
					window.location.href="student-delete?stu.id="+e.lang;
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
				    content: "saveAndModify?"+e.lang
				});
			});
		});
		$(".addEmploee").click(function(){
			//页面层
				layer.open({
				    type: 2,
				    title:'addEmploee',
				   // skin: 'layui-layer-rim', //加上边框
				   	area: ['500px', '300px'], //宽高
				    content: "saveAndModify"
				});	
			});
			
	});

$(function pickDate( cellvalue, options, cell ) {
	setTimeout(function(){
		$(cell) .find('input[type=text]')
				.datepicker({format:'yyyy-mm-dd' , autoclose:true}); 
	}, 0);
});