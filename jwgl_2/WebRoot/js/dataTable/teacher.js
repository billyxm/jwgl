$(document).ready(function(table,reqData){
	var data=[
			{'id':1,'tno':"132051"},{'id':2,'tno':"2345"}];
   table = $("#myTable").DataTable(
   	{
   		data:data,
         //scrollY: 200,表格里的数据Y轴滚动
         scrollX: 200,//表格里的数据X轴滚动
       // "processing": true,
        //"serverSide": true,
       // 'stateSave':true,//保存状态 - 在页面重新加载的时候恢复状态（页码等内容） 
        'processing':true,//当表格处在处理过程（例如排序）中时，启用或者禁止 'processing'指示器的显示。  
       /* "ajax": {
               dataType:'json',  
              
               type:'get',//更改Ajax的请求方式   
               url:"view.action",//从一个ajax数据源读取数据给表格内容  
               dataSrc:"dataMap"
         },*/
   		"columns":[
         	   {"data":"id"},
               {"data":"tno"},
               {"data":"tname"},
               {"data":"tsex"},
               {"data":"borndate"},
               {"data":"tel"},
               {"data":"email"},
               {"data":"college"},
               {"data":"department"},
               {"data":"education"},
               {"data":"professional"},
               {"data":"direction"},
               {"data":"gradpro"},
               {"data":"gradschool"},
               {"data":"brief"},
               {"data":"indate"}
   			],
          "language": {   //语言国际化  
                "lengthMenu": "_MENU_ 条记录每页",   //'每页显示记录'的下拉框的提示信息  
                "zeroRecords": "没有找到记录",    //当搜索结果为空时，显示的信息  
                "info": "第 _PAGE_ 页 ( 总共 _PAGES_ 页 )",  //表格的page分页所需显示的所有字符串  
                "infoEmpty":"没有检索到有效数据！",   //当表格没有数据时，汇总地方显示的字符串  
                "infoFiltered": "(从 _MAX_ 条记录过滤)",  //当表格搜索后，在汇总字符串上需要增加的内容 
                "search":"查找：",  
                "processing":"正在加载数据，请稍候...",  
                "paginate": {   //分页信息显示所需的字符串的所有信息  
                "previous": "上一页",  //分页信息的 'previous' 按钮显示的信息  
                "next": "下一页" //分页信息的 'next' 按钮显示的信息  
                
                }  
   			},
         "dom": "<'row'<'col-xs-2'l><'#mytool.col-xs-4'><'col-xs-6'f>r>" + 
         //通过一个自定义的字符串来定义DataTables里面所有组件的显示,位置和显隐.
                    "t" +
                    "<'row'<'col-xs-6'i><'col-xs-6'p>>",
            initComplete: function () {//初始化结束后的回调函数
                $("#mytool").append('<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" onclick="addData()" >添加</button> ');
                $("#mytool").append('<button type="button" class="btn btn-success btn-sm" data-toggle="modal" onclick="delData()" >删除</button> ');
                $("#mytool").append('<button type="button" class="btn btn-info btn-sm" data-toggle="modal" onclick="editData()">修改</button> ');
            }
   	   });
 		
   	
 /*//选中行，然后返回其id
 $('#myTable tbody').on( 'click', 'tr', function () {
              if ( $(this).hasClass('selected') ) {
                  $(this).removeClass('selected');
              }
              else {
                  table.$('tr.selected').removeClass('selected');
                  $(this).addClass('selected');
              }
      selectedId = table.row('.selected').data().id;
      selectedTno = table.row('.selected').data().tno;
      
      console.log("选中行的id:"+ selectedId);
      $("#tno").val(selectedTno);
           });
*/


 }); 
         /**
          * 添加数据
          **/
         function addData() {
         $("#myModal").modal("show");
         $("#myModalLabel").text("新增");
         url = "addStudentJson.action";
         }

         /**
            * 删除数据
         **/
         function delData() {
         var flag = confirm("确定删除么？");
         if(flag){
         $.ajax({
         url : "delStudentJson.action",
         data : {
         "id" : selectedId
         },
         success : function(data) {
         //console.log("结果" + data);
         table.ajax.reload(); 
         }
         });
         }

         }

         /**
          * 编辑数据
          **/
         function editData() {
         $("#myModal").modal("show");
         $("#myModalLabel").text("修改");
         url = "editStudentJson.action";
         }

         /**
     * 检查数据格式是否符合要求
     * 此处只检验是否为空，为空则提示数据为空，请输入数据。
     */
    function checkData() {
     var checkFlag = true;
     if($("#tno").val()==""){
      alert("亲~工号不能为空哦( ^_^ )");
checkFlag = false;
     }
     if($("#tname").val()==""){
      alert("亲~性别不能为空哦( ^_^ )");
      checkFlag = false;
     }
     if($("#tsex").val()==""){
      alert("亲~年龄不能为空哦( ^_^ )");
      checkFlag = false;
     }
     if($("#borndate").val()==""){
      alert("亲~学历不能为空哦( ^_^ )");
      checkFlag = false;
     }
$("#myModal").modal("show");
return checkFlag;
    }













 