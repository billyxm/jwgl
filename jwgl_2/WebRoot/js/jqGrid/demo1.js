jQuery(grid_selector).jqGrid({
		data: grid_data,
		//url: "jqGrid01.action"
		datatype: "json",
		height: 300,
		colNames:[' ', '工号', '姓名', '性别', '出生日期', '联系电话', 'Email', '学院', '系别', '学历', '职称', '学科方向', '毕业专业', '毕业学校', '教师简介','创建时间'],
		colModel:[
			{name:'myac',index:'', width:80, fixed:true, sortable:false, resize:false,
				formatter:'actions', 
				formatoptions:{ 
					keys:true,
					
					delOptions:{recreateForm: true, beforeShowForm:beforeDeleteCallback},
					//editformbutton:true, editOptions:{recreateForm: true, beforeShowForm:beforeEditCallback}
				}
			},
			{ name: 'tno', index: 'tno', width: 70,align:'center',editable:true},
			{ name: 'tname', index: 'tname', width: 60,align:'center',editable:true},
			{ name: 'tsex', index: 'tsex', width: 40,align:'center',editable:true},
			{ name: 'borndate', index: 'borndate', width: 80,align:'center',editable:true,sorttype:'date',unformat: pickDate},
			{ name: 'tel', index: 'tel', width: 100,align:'center',editable:true},
			{ name: 'email', index: 'email', width: 120,align:'center',editable:true},
			{ name: 'college', index: 'college', width: 120,align:'center',editable:true},
			{ name: 'department', index: 'department', width: 120,align:'center',editable:true},
			{ name: 'education', index: 'education', width: 60,align:'center',editable:true},
			{ name: 'professional', index: 'professional', width: 50,align:'center',editable:true},
			{ name: 'direction', index: 'direction', width: 100,align:'center',editable:true},
			{ name: 'gradpro', index: 'gradpro', width:100,align:'center',editable:true},
			{ name: 'gradschool', index: 'gradschool', width: 100,align:'center',editable:true},
			{ name: 'brief', index: 'brief', width: 500,align:'center',editable:true},
			{ name: 'indate', index: 'indate', width: 140,align:'center'}
			
		], 