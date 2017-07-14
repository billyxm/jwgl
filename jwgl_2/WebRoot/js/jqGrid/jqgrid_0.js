//这里设置表格宽度，避免列的增加，导致表格超出HTML页面的宽度
$(window).on('resize.jqGrid', function () {
	$(grid_selector).jqGrid( 'setGridWidth', $(".page-content").width() );
  });

$(document).ready(function(){  
     $("#gridTable").jqGrid({  
               url: "teacher_view",  
               datatype: "json",  
               mtype : "post",  
               height: 250,  
               colNames:['工号', '姓名', '性别', '出生日期', '联系电话', 'Email', '学院', '系别', '学历', '职称', '学科方向', '毕业专业', '毕业学校', '教师简介','创建时间'],
               colModel:[
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
               sortname:'id',  
               sortorder:'asc',  
               /*editurl: 'server.php', */  
               viewrecords:true,  
               rowNum:10,  
               rowList:[10,20,30],  
               prmNames : {    
                   search : "search"    
               },  
               jsonReader : {    
                   root : "result",  
                   records : "record",   
                   repeatitems : false  
               },  
               pager:"#gridPager",  
               caption: "教师信息管理",  
               hidegrid : false  
       });  
        
       
       $('#gridTable').jqGrid('navGrid','#gridPager',{  
           refresh:true,   
           edit:true,  
           add:true,  
           del:true,  
           search:false,  
           addfunc:openDialog4Adding,  
           editfunc:openDialog4Updating,  
           delfunc:openDialog4Deleting  
       });  
         
       //配置对话框  
       $("#consoleDlg").dialog({  
           autoOpen:false,  
           modal:true,      //设置对话框为模态对话框  
           resizable:true,  
           width:480,  
           buttons:{  
               "取消":function(){  
                   $("#consoleDlg").dialog("close")  
               },  
               "新增":addTeacher,  
               "修改":editTeacher,  
               "删除":delTeacher  
           }  
       });  
         
         
         
         
         
}); 


//可用的borndate 弹出时间选择，继承Bookstrap的datepicker
function pickDate( cellvalue, options, cell ) {
	setTimeout(function(){
		$(cell) .find('input[type=text]')
				.datepicker({format:'yyyy-mm-dd' , autoclose:true}); 
	}, 0);
}

  
var openDialog4Adding = function() {    
    var consoleDlg = $("#consoleDlg");    
    var dialogButtonPanel = consoleDlg.siblings(".ui-dialog-buttonpane");    
    consoleDlg.find("input").removeAttr("disabled").val("");    
    dialogButtonPanel.find("button:not(:contains('取消'))").hide();    
    dialogButtonPanel.find("button:contains('新增')").show();    
    consoleDlg.dialog("option", "title", "add record").dialog("open");  
};  
  
var openDialog4Updating = function() {  
   var consoleDlg = $("#consoleDlg");    
   var dialogButtonPanel = consoleDlg.siblings(".ui-dialog-buttonpane");    
   consoleDlg.find("input").removeAttr("disabled");    
   dialogButtonPanel.find("button:not(:contains('取消'))").hide();    
   dialogButtonPanel.find("button:contains('修改')").show();    
   consoleDlg.dialog("option", "title", "edit record");    
   loadSelectedRowData();    
};  
  
var openDialog4Deleting = function() {    
   var consoleDlg = $("#consoleDlg");    
   var dialogButtonPanel = consoleDlg.siblings(".ui-dialog-buttonpane");    
   consoleDlg.find("input").attr("disabled", true);    
   dialogButtonPanel.find("button:not(:contains('取消'))").hide();    
   dialogButtonPanel.find("button:contains('删除')").show();    
   consoleDlg.dialog("option", "title", "delete record");    
   loadSelectedRowData();    
};  
  
var loadSelectedRowData = function() {  
   var selectedRowId = $("#gridTable").jqGrid("getGridParam", "selrow");  
   if (!selectedRowId) {    
        alert("请先选择需要编辑的行!");    
        return false;    
    } else {  
        var params = {  
                "teacher.id" : selectedRowId  
        };  
          
        //从Server读取对应ID的JSON数据  
        $.ajax({  
            url : "teacher_find",  
            data : params,  
            dataType : "json",    
            cache : false,    
            error : function(textStatus, errorThrown) {    
                alert("系统ajax交互错误: " + textStatus);    
            },  
            success : function(data, textStatus) {    
            // 如果读取结果成功，则将信息载入到对话框中                     
            var rowData = data.teacher;    
            var consoleDlg = $("#consoleDlg");  
              
            consoleDlg.find("#selectId").val(rowData.id);    
            consoleDlg.find('#tno').val(rowData.tno);
            consoleDlg.find('#tname').val(rowData.tname);  
            consoleDlg.find('#borndate').val(rowData.borndate);
            consoleDlg.find('#tel').val(rowData.tel);
            consoleDlg.find('#email').val(rowData.email);
            consoleDlg.find('#college').val(rowData.college);
            consoleDlg.find('#department').val(rowData.department);
            consoleDlg.find('#education').val(rowData.education);
            consoleDlg.find('#professional').val(rowData.professional);
            consoleDlg.find('#direction').val(rowData.direction);
            consoleDlg.find('#gradpro').val(rowData.gradpro);
            consoleDlg.find('#gradschool').val(rowData.gradschool);
            consoleDlg.find('#brief').val(rowData.brief);
            //tno, tname, tsex, borndate, tel, email, college,department,education,professional,
            //direction,gradpro,grdschool,brief
            // 根据新载入的数据将表格中的对应数据行一并更新一下    
            var dataRow = {    
                id : rowData.id,  
                tno :rowData.tno,
                tname : rowData.tname,
                borndate : rowData.borndate,
                tel :rowData.tel,
                email :rowData.email,
                college : rowData.college,
                department :rowData.department,
                education : rowData.education,
                professional : rowData.professional,
                direction : rowData.direction,
                gradpro : rowData.gradpro,
                gradschool : rowData.gradschool,
                brief : rowData.brief


            };    
            $("#gridTable").jqGrid("setRowData", data.teacher.id, dataRow);    
            // 打开对话框    
            consoleDlg.dialog("open");    
        }  
        });  
    }  
};  
  
var addTeacher = function() {    
    var consoleDlg = $("#consoleDlg");  
     
    var tno = $.trim(consoleDlg.find("#tno").val());  
    var tname = $.trim(consoleDlg.find("#tname").val());  
    var borndate = $.trim(consoleDlg.find("#borndate").val());  
    var tel = $.trim(consoleDlg.find("#tel").val());  
    var email = $.trim(consoleDlg.find("#email").val());  
    var college = $.trim(consoleDlg.find("#college").val());
    var department = $.trim(consoleDlg.find("#department").val());  
    var education = $.trim(consoleDlg.find("#education").val());  
    var professional = $.trim(consoleDlg.find("#professional").val());  
    var direction = $.trim(consoleDlg.find("#direction").val());  
    var gradpro = $.trim(consoleDlg.find("#gradpro").val());  
    var gradschool = $.trim(consoleDlg.find("#gradschool").val());
    var brief = $.trim(consoleDlg.find("#brief").val());
      
    var params = {  
            "teacher.tno" : tno,
            "teacher.tname" : tname, 
            "teacher.borndate" : borndate, 
            "teacher.tel" : tel, 
            "teacher.email" : email, 
            "teacher.college" : college, 
            "teacher.department" : department, 
            "teacher.education" : education, 
            "teacher.professional" : professional, 
            "teacher.direction" : direction, 
            "teacher.gradpro" : gradpro, 
            "teacher.gradschool" : gradschool, 
            "teacher.brief" : brief 

    };    
        
    $.ajax( {    
        url : "teacher_add",    
        data : params,    
        dataType : "json",    
        cache : false,    
        error : function(textStatus, errorThrown) {    
            alert("系统ajax交互错误: " + textStatus);  
        },    
        success : function(data, textStatus) {    
            if (data.message == true) {    
                var dataRow = {  
                    id : data.teacher.id,    //从server端获得系统分配的id   
                    tno :tno,
                    tname : tname,
                    borndate : borndate,
                    tel :tel,
                    email :email,
                    college : college,
                    department :department,
                    education : education,
                    professional : professional,
                    direction : direction,
                    gradpro : gradpro,
                    gradschool : gradschool,
                    brief : brief 
                };    
                  
                /*   
                var srcrowid = $("#gridTable").jqGrid("getGridParam",    
                        "selrow");     
                */  
                    
                $("#gridTable").jqGrid("addRowData",    
                        data.teacher.id, dataRow, "last");    //将新行插入到末尾  
                  
                consoleDlg.dialog("close");  
                alert("添加成功!");    
            }else{    
                alert("添加失败!");    
            }  
        }    
    });    
};  
  
var editTeacher = function() {  
     
   var consoleDlg = $("#consoleDlg"); 
   var pId = $.trim(consoleDlg.find("#selectId").val()); 
   var tno = $.trim(consoleDlg.find("#tno").val());  
    var tname = $.trim(consoleDlg.find("#tname").val());  
    var borndate = $.trim(consoleDlg.find("#borndate").val());  
    var tel = $.trim(consoleDlg.find("#tel").val());  
    var email = $.trim(consoleDlg.find("#email").val());  
    var college = $.trim(consoleDlg.find("#college").val());
    var department = $.trim(consoleDlg.find("#department").val());  
    var education = $.trim(consoleDlg.find("#education").val());  
    var professional = $.trim(consoleDlg.find("#professional").val());  
    var direction = $.trim(consoleDlg.find("#direction").val());  
    var gradpro = $.trim(consoleDlg.find("#gradpro").val());  
    var gradschool = $.trim(consoleDlg.find("#gradschool").val());
    var brief = $.trim(consoleDlg.find("#brief").val());
   var params = {  
           "teacher.id" : pId,
           "teacher.tno" : tno,
            "teacher.tname" : tname, 
            "teacher.borndate" : borndate, 
            "teacher.tel" : tel, 
            "teacher.email" : email, 
            "teacher.college" : college, 
            "teacher.department" : department, 
            "teacher.education" : education, 
            "teacher.professional" : professional, 
            "teacher.direction" : direction, 
            "teacher.gradpro" : gradpro, 
            "teacher.gradschool" : gradschool, 
            "teacher.brief" : brief   
 
   };  
   $.ajax({  
       url : "teacher_edit",  
       data : params,  
       dataType : "json",  
       cache : "false",  
       error : function(textStatus, errorThrown) {    
           alert("系统ajax交互错误: " + textStatus);    
       },  
       success : function(data, textStatus){  
           if(data.message == true){  
               var dataRow = {  
                       id : data.teacher.id,  
                       tno :tno,
                        tname : tname,
                        borndate : borndate,
                        tel :tel,
                        email :email,
                        college : college,
                        department :department,
                        education : education,
                        professional : professional,
                        direction : direction,
                        gradpro : gradpro,
                        gradschool : gradschool,
                        brief : brief 
                        
               };  
               $("#gridTable").jqGrid("setRowData", data.teacher.id, dataRow,  
                       {  
                            color : "#FF0000"  
                       });  
               alert("更新成功!");  
               consoleDlg.dialog("close");  
           }else{  
               alert("修改失败!");  
           }  
       }  
          
   });  
};  
  
var delTeacher = function() {  
    var consoleDlg = $("#consoleDlg");    
    var pId = $.trim(consoleDlg.find("#selectId").val());    
    var params = {    
        "teacher.id" : pId    
    };    
    $.ajax( {    
        url : "teacher_del",    
        data : params,    
        dataType : "json",    
        cache : false,    
        error : function(textStatus, errorThrown) {    
            alert("系统ajax交互错误: " + textStatus);    
        },    
        success : function(data, textStatus) {  
            if (data.message==true) {    
                $("#gridTable").jqGrid("delRowData", pId);    
                consoleDlg.dialog("close");    
                alert("删除成功!");    
            } else {    
                alert("删除操作失败!");  
            }  
        }    
    });    
};    