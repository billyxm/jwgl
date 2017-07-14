<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="zh">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <!--<meta name="viewport" content="width=device-width, initial-scale=1.0" />-->
    <!--防止移动设备手指放大或缩少屏幕导致变化-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <!--bootstrap模板和图标模板-->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" />
    <!--要引用dataTabale要导入两个必备的文件-->
    <link rel="stylesheet" href="css/jquery.dataTables.min.css" />
    
    <!--ace字体css-->
    <link rel="stylesheet" type="text/css" href="css/ace-fonts.css">
    <!--默认先用jqGrid皮肤-->
    <link rel="stylesheet" type="text/css" href="css/ace.min.css">
  	<!--教师管理专用css-->
    <link rel="stylesheet" href="css/teacher.css" />
    <link rel="stylesheet" href="css/ace-skins.min.css" />
    <link rel="stylesheet" href="css/ace-rtl.min.css" />
    <!--[if lte IE 9]>
      <link href="css/ace-part2.min.css" rel="stylesheet" />
    <![endif]-->
    <link rel="stylesheet" href="css/user_index.css" />
    <!--[if lte IE 9]>
      <link href="css/ace-ie.min.css" rel="stylesheet" />
    <![endif]-->
    <script type="text/javascript" src="js/jquery.min.js" ></script>
    <title>教务管理系统</title>
    <meta name="description" content="page description" />
    
    <script src="js/ace-extra.min.js"></script>
      <!--[if lte IE 8]>
       <script src="js/html5shiv.min.js"></script>
       <script src="js/respond.min.js"></script>
      <![endif]-->
</head>
<body class="no-skin" >
 <div class="navbar navbar-default",id="navbar">
     <!-- navbar goes here -->
     <script type="text/javascript">
    try{ace.settings.check('navbar' , 'fixed')}catch(e){}
    </script>
    <div class="navbar-container" id="navbar-container">
      <!--描述：此处的button是移动设备专用的-->
      <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
        <span class="sr-only">Togger sidebar</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <div class="navbar-header pull-left">
        <a href="demo.html" class="navbar-brand">
        <small>
          <i class="fa fa-university" aria-hidden="true"></i>
          教务管理系统
        </small>
        </a>
      </div>
      <div class="navbar-header navbar-buttons pull-right" role="navigation">
        <ul class="nav ace-nav">
          <li class="green">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
              <i class="ace-icon fa fa-envelope icon-animated-vertical"></i>
              <span class="badge badge-success">
                4 <!--此处是消息的条数-->
              </span>
            </a>
            <ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
              <li class="dropdown-header">
                <i class="ace-icon fa fa-envelope-o">
                  5条信息
                </i>
              </li>
              <li class="dropdown-content ace-scroll" style="position: relative;">
                <div class="scroll-track" style="display: none;">
                  <div class="scroll-bar"></div>
                </div>
                <div class="scroll-content" style="max-height: 600px;">
                <ul class="dropdown-menu dropdown-navbar">
                  <li>
                    <a href="#">
                      <img src="images/user/avatar.png" class="msg-photo" alt="Alex's Avatar" />
                      <span class="msg-body">
                      <span class="msg-title">
                      <span class="blue">Alex:</span>
                          Ciao sociis natoque penatibus et auctor ...
                      </span>
                      <span class="msg-time">
                        <i class="ace-icon fa fa-clock-o"></i>
                        <span>a moment ago</span>
                      </span>
                      </span>
                      </a>
                  </li>
                  <li>
                    <a href="#">
                      <img src="images/user/avatar3.png" class="msg-photo" alt="Susan's Avatar" />
                        <span class="msg-body">
                          <span class="msg-title">
                            <span class="blue">Susan:</span>
                            Vestibulum id ligula porta felis euismod ...
                          </span>

                          <span class="msg-time">
                            <i class="ace-icon fa fa-clock-o"></i>
                            <span>20 minutes ago</span>
                          </span>
                        </span>
                    </a>
                  </li>
                  <li>
                      <a href="#">
                        <img src="images/user/avatar4.png" class="msg-photo" alt="Bob's Avatar" />
                        <span class="msg-body">
                          <span class="msg-title">
                            <span class="blue">Bob:</span>
                            Nullam quis risus eget urna mollis ornare ...
                          </span>

                          <span class="msg-time">
                            <i class="ace-icon fa fa-clock-o"></i>
                            <span>3:15 pm</span>
                          </span>
                        </span>
                      </a>
                  </li>
                    <li>
                      <a href="#">
                        <img src="images/user/avatar2.png" class="msg-photo" alt="Kate's Avatar" />
                        <span class="msg-body">
                          <span class="msg-title">
                            <span class="blue">Kate:</span>
                            Ciao sociis natoque eget urna mollis ornare ...
                          </span>
                          <span class="msg-time">
                            <i class="ace-icon fa fa-clock-o"></i>
                            <span>1:33 pm</span>
                          </span>
                        </span>
                      </a>
                    </li>
                    <li>
                      <a href="#">
                        <img src="images/user/avatar5.png" class="msg-photo" alt="Fred's Avatar" />
                        <span class="msg-body">
                          <span class="msg-title">
                            <span class="blue">Fred:</span>
                            Vestibulum id penatibus et auctor  ...
                          </span>
                          <span class="msg-time">
                            <i class="ace-icon fa fa-clock-o"></i>
                            <span>10:09 am</span>
                          </span>
                        </span>
                      </a>
                    </li>
                  </ul></div>
                </li>
                <li class="dropdown-footer">
                  <a href="inbox.html">
                    See all messages
                    <i class="ace-icon fa fa-arrow-right"></i>
                  </a>
                </li>
              </ul>
            </li>
          <li class="light-blue">
              <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                <img class="nav-user-photo" src="images/user/avatar4.png" alt="Jason's Photo">
                <span class="user-info">
                  <small>欢迎您，</small>
                  教师${session.tname}
                </span>
                <i class="ace-icon fa fa-caret-down"></i>
              </a>
              <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                <li>
                  <a href="setting">
                    <i class="ace-icon fa fa-cog"></i>
                    设置
                  </a>
                </li>
                <li>
                  <a href="profile">
                    <i class="ace-icon fa fa-user"></i>
                    简介
                  </a>
                </li>
                <li class="divider"></li>
                <li>
                  <a href="logout">
                    <i class="ace-icon fa fa-power-off"></i>
                    退出系统
                  </a>
                </li>
              </ul>
            </li>
        </ul>
      </div>
    </div>
    </div>
 
    <div class="main-container" id="main-container">
      
     <div id="sidebar" class="sidebar responsive ">
        <script type="text/javascript">
          try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
        </script>
        <!-- /.sidebar-shortcuts -->
        <div style="position: relative;">
          <div class="nav-wrap" style="max-height: 800px;">
            <div style="position: relative; top: 0px; transition-property: top; transition-duration: 0.2s;"><div class="sidebar-shortcuts" id="sidebar-shortcuts">
          <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
            <!--
                          作者：offline
                          时间：2017-03-19
                          描述：此处是快捷栏
                        -->
            <button class="btn btn-success">
              <i class="ace-icon fa fa-signal"></i>
            </button>
            <button class="btn btn-info">
              <i class="ace-icon fa fa-pencil"></i>
            </button>
            <!-- #section:basics/sidebar.layout.shortcuts -->
            <button class="btn btn-warning">
              <i class="ace-icon fa fa-users"></i>
            </button>

            <button class="btn btn-danger">
              <i class="ace-icon fa fa-cogs"></i>
            </button>

            <!-- /section:basics/sidebar.layout.shortcuts -->
          </div>
          <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
            <span class="btn btn-success"></span>

            <span class="btn btn-info"></span>

            <span class="btn btn-warning"></span>

            <span class="btn btn-danger"></span>
          </div>
        </div><ul class="nav nav-list">
          <li class="">
			<a href="index">
				<i class="menu-icon fa fa-home"></i>
				<span class="menu-text"><font><font> 主页 </font></font></span>
			</a>
			<b class="arrow"></b>
		</li>
		<li class=" active hsub">
			<a href="#" >
				<i class="menu-icon fa fa-pagelines"></i>
				<span class="menu-text">个人信息 </span>
			</a>	
		</li>
		<li class="hsub">
			<a href="student-tea">
				<i class="menu-icon fa fa-child"></i>
				<span class="menu-text"><font><font> 学生信息 </font></font></span>
			</a>
			<b class="arrow"></b>
		</li>
		<li class="hsub">
			<a href="CoursePlan" >
				<i class="menu-icon fa fa-book"></i>
				<span class="menu-text"><font><font> 课程安排 </font></font></span>
			</a>
			<b class="arrow"></b>
		</li>
		<li class="">
			<a href="grade-tea">
				<i class="menu-icon fa fa-calendar"></i>
				<span class="menu-text"><font><font> 成绩管理 </font></font></span>
			</a>
			<b class="arrow"></b>
		</li>
		
		<li class="">
			<a href="setting.html">
				<i class="menu-icon fa fa-cog"></i>
				<span class="menu-text"><font><font> 系统设置 </font></font></span>
			</a>
			<b class="arrow"></b>
		</li>
                  
        </ul></div></div>
        <div class="ace-scroll nav-scroll scroll-active">
          <div class="scroll-track" style="display: block; height: 565px;">
            <div class="scroll-bar" style="height:top: 0px; transition-property: top; transition-duration: 0.13s;"></div>
          </div>
          <div class="scroll-content">
            <div style="">  
            </div>
            </div>
        </div></div><!-- /.nav-list -->
        <!-- #section:basics/sidebar.layout.minimize -->
        <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse" style="z-index: 1;">
          <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
        </div>

        <!-- /section:basics/sidebar.layout.minimize -->
        <script type="text/javascript">
          try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
        </script>
      </div>
 <!--
  作者：743275994@qq.com
  时间：2017-03-19
  描述：
 --> 
     <div class="main-content">
      <div class="breadcrumbs" id="breadcrumbs">
       <!-- 页面的指向例如：首页>子页 -->
              <script type="text/javascript">
            try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
          </script>

        <ul class="breadcrumb">
          <li>
            <i class="ace-icon fa fa-home home-icon"></i>
            <a href="index">首页</a>
          </li>
        <li class="active">
            
                <!--作者：offline
                时间：2017-03-18
                描述：此处是每一个页面的名称-->
              教师管理 
            
          </li>
        </ul>
      </div>
      <!--内容开始-->
      <div class="page-content" >	
      	<!--<div class="page-header">
      		<h1>教师信息管理</h1>
      	</div>-->
      	<div class="alert alert-block alert-success">
			<button type="button" class="close" data-dismiss="alert">
				<i class="ace-icon fa fa-times"></i>
			</button>
			<i class="ace-icon fa fa-check green"></i>温馨提示：如果你想查看完毕是否请返回<a href="index">上一层</a>。</div>
      	<div class="row">
      		<div class="col-xs-12 " ><!--分割线的设计-->
      			<!--内容开始-->
      			<h1>个人信息</h1>
      			<table class="table table-striped table-bordered table-hover">
      				<tbody>
      				
      					<tr>
      						<td><label>工号：</label></td>
      						<td><s:property value="%{tea.tno}"   /></td>
      						<td><label>姓名：</label></td>
      						<td><s:property value="%{tea.tname}" /></td>
      						<td><label>性别：</label></td>
      						<td><s:property value="%{tea.tsex}" /></td>
      					</tr>
      					<tr>
      						<td><label>出生年月日</label></td>
      						<td><s:property value="%{tea.borndate}" /></td>
      						<td><label>电话</label></td>
      						<td><s:property value="%{tea.tel}" /></td>
      						<td><label>Email</label></td>
      						<td><s:property value="%{tea.email}" /></td>
      					</tr>
      					<tr>
      						<td><label>学院</label></td>
      						<td><s:property value="%{tea.college}" /></td>
      						<td><label>系部</label></td>
      						<td><s:property value="%{tea.department}" /></td>
      						<td><label>学历</label></td>
      						<td><s:property value="%{tea.education}" /></td>
      					</tr>
      					<tr>
      						<td><label>职称</label></td>
      						<td><s:property value="%{tea.professional}" /></td>
      						<td><label>研究方向</label></td>
      						<td><s:property value="%{tea.direction}" /></td>
      						<td><label>毕业方向</label></td>
      						<td><s:property value="%{tea.gradpro}" /></td>
      					</tr>
      					<tr>
      						<td><label>毕业学校</label></td>
      						<td><s:property value="%{tea.gradschool}" /></td>
      						<td><label>简介</label></td>
      						<td><s:property value="%{tea.brief}" /></td>
      						<td><label>创建时间</label></td>
      						<td><s:property value="%{tea.indate}}" /></td>
      					</tr>
      					<tr>
      						<td><label>个人密码</label></td>
      						<td><s:property value="%{tea.tpassword}" /></td>
      					</tr>
      					
      				</tbody>
      			</table>
      			
				
      		</div>
      	</div>
      </div>
    </div>
    <!--footer-->
    <div class="footer">
    	<div class="footer-inner">
    		<div class="footer-content">
    			<div class="footer-content">
    				<span class="bigger-120">	版权所有</span>
    				<span class="blue bolder">@Billy</span>
    			</div>
    		</div>
    	</div>
    </div>
     
  	<!-- inline scripts related to this page and dataTable -->
	<script type="text/javascript" src="js/bootstrap.min.js" ></script>
	<!-- page specific plugin scripts -->
	<script type="text/javascript" src="js/date-time/bootstrap-datepicker.min.js" ></script>
  
	<!-- ace scripts -->
  	<script type="text/javascript" src="js/ace-elements.min.js" ></script>
  	<script type="text/javascript" src="js/ace.min.js" ></script>
  	<!-- inline scripts related to this page -->
  	<link rel="stylesheet" href="css/ace.onpage-help.css" />
    <link rel="stylesheet" href="css/themes/sunburst.css" />
  </body>
</html>
