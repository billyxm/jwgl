var w,h,classname;
function getSrceenWH(){
	w = $(window).width();
	h = $(window).height();
	$('dialogBg').width(w).height(h);
}

window.onresize = function(){
	getSrceenWH();
}


function addTeacher(){
	getSrceenWH();
	//显示弹框
	$('#btnAdd').click(function(){
		className = $(this).attr('class');
		$('#dialogBg').fadeIn(300);
		$('#dialog').removeAttr('class').addClass('animated '+'').fadeIn();
	});
	
	//关闭弹窗
	$('.claseDialogBtn').click(function(){
		$('#dialogBg').fadeOut(300,function(){
			$('#dialog').addClass('bounceOutUp').fadeOut();
		});
	});
};
//删除
function delTeacher(){
	getSrceenWH();
	//显示弹框
	$('#btnDel').click(function(){
		className = $(this).attr('class');
		$('#dialogBg').fadeIn(300);
		$('#dialogDel').removeAttr('class').addClass('animated '+'').fadeIn();
	});
	
	//关闭弹窗
	$('.claseDialogBtn').click(function(){
		$('#dialogBg').fadeOut(300,function(){
			$('#dialogDel').addClass('bounceOutUp').fadeOut();
		});
	});
};


	/* Act on the event */
function editTeacher(){
	getSrceenWH();
	//显示弹框
	$('#btnEdit').click(function(){
		className = $(this).attr('class');
		$('#dialogBg').fadeIn(300);
		$('#dialogEdit').removeAttr('class').addClass('animated '+'').fadeIn();
	});
	
	//关闭弹窗
	$('.claseDialogBtn').click(function(){
		$('#dialogBg').fadeOut(300,function(){
			$('#dialogEdit').addClass('bounceOutUp').fadeOut();
		});
	});
};
