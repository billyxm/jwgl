<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="jwgl.action.LoginAction" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
    <link rel="stylesheet" href="css/jquery-ui.custom.min.css" />
     <!--ace字体css-->
    <link rel="stylesheet" type="text/css" href="css/ace-fonts.css">
    <!--默认先用jqGrid皮肤-->
    <link rel="stylesheet" type="text/css" href="css/ace.min.css">
  	<!--教师管理专用css-->
    <link rel="stylesheet" href="css/regStu.css" />
    <link rel="stylesheet" href="css/ace-skins.min.css" />
    <link rel="stylesheet" href="css/ace-rtl.min.css" />
    <!--[if lte IE 9]>
      <link href="css/ace-part2.min.css" rel="stylesheet" />
    <![endif]-->
    
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
 <body class="no-skin">
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
        <a href="demo" class="navbar-brand">
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
                  <a href="inbox">
                    See all messages
                    <i class="ace-icon fa fa-arrow-right"></i>
                  </a>
                </li>
              </ul>
            </li>
          <li class="light-blue">
              <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                <img class="nav-user-photo" src="images/user/user.jpg" alt="Jason's Photo">
                <span class="user-info">
                  <small>欢迎您，</small>
                  教务员${session.name}
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
      <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
      </script>
     <div id="sidebar" class="sidebar responsive">
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
            <a href="demo">
              <i class="menu-icon fa fa-home"></i>
              <span class="menu-text"><font><font> 主页 </font></font></span>
            </a>
            <b class="arrow"></b>
          </li>
          <li class=" hsub ">
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-pagelines"></i>
              <span class="menu-text"><font><font> 师资管理 </font></font></span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu " >
              <li >
                <a href="teacher">
                  <i class="menu-icon fa fa-caret-right"></i>
                  教师信息
                </a>
                <b class="arrow"></b>               
              </li>
              <li class="">
                <a href="teachTask">
                  <i class="menu-icon fa fa-caret-right"></i>
                  教学任务
                </a>
                <b class="arrow"></b>
              </li>
            </ul>
          </li>
          <li class="active hsub open">
            <a href="#" class="dropdown-toggle">
              <i class="menu-icon fa fa-child"></i>
              <span class="menu-text"><font><font> 学籍管理 </font></font></span>
              <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
              <li class="active">
                <a href="reg_stu">
                  <i class="menu-icon fa fa-caret-right"></i>
                  注册管理
                </a>
                <b class="arrow"></b>
              </li>
              <li class="">
                <a href="student">
                  <i class="menu-icon fa fa-caret-right"></i>
                  学生信息
                </a>
                <b class="arrow"></b>
              </li>
              <li class="">
                <a href="graduate">
                  <i class="menu-icon fa fa-caret-right"></i>
                  毕业生管理
                </a>
                <b class="arrow"></b>
              </li>
            </ul>
          </li>
          <li class="hsub">
            <a href="course" >
              <i class="menu-icon fa fa-book"></i>
              <span class="menu-text"><font><font> 课程管理 </font></font></span>
            </a>
            <b class="arrow"></b>
          </li>
          <li class="">
            <a href="courseArrange">
              <i class="menu-icon fa fa-calendar"></i>
              <span class="menu-text"><font><font> 考务管理 </font></font></span>
            </a>
            <b class="arrow"></b>
          </li>
          <li class="">
            <a href="courseSelect">
              <i class="menu-icon fa fa-list-alt"></i>
              <span class="menu-text"><font><font>
                选课管理
              </font></font><!-- #section:basics/sidebar.layout.badge --> 
                <!-- /section:basics/sidebar.layout.badge -->
              </span>
          </a>
            <b class="arrow"></b></li>
          <li class="">
            <a href="grade">
              <i class="menu-icon fa fa-columns"></i>
              <span class="menu-text"><font><font>
                成绩管理
              </font></font><!-- #section:basics/sidebar.layout.badge -->           
                <!-- /section:basics/sidebar.layout.badge -->
              </span>
            </a>
            <b class="arrow"></b>
        </li>
          <li class="">
            <a href="setting">
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
            <a href="demo">首页</a>
          </li>
          <li>
          	<a href="reg_stu" >学生注册</a>
          </li>
          <li class="active"> 
        	老生注册
          </li>
        </ul>
      </div>
      <!--内容开始-->
      <div class="page-content" >	
      	<div class="row">
      		<div class="well well-sm">
      			<button type="button" class="close line-height-0" data-dismiss="alert">
					<i class="ace-icon fa fa-times smaller-75"></i>
				</button>
				温馨提示：如果你想查询学生是否已经注册请返回<a href="reg_stu">上一层</a>查询。
				<i class="fa fa-external-link bigger-110"></i>
					
			</div>
      		<div class="col-sm-3 " ><!--分割线的设计-->
      			<!--内容开始-->
      			<div class="widget-box">
      				<div class="widget-header ">
      					<h4>学生单独注册</h4>
      				</div>   
      				<div class="widget-body">
      					<div class="widget-main">
      						<div class="clearfix">
      							<label>请输入学号</label><br>
      							<input type="text" name="sno" class="form"/>
      							<div class="btn-new-al left">
      								<button type="button" class="btn btn-sm btn-success">提交
										<i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
									</button>
								</div>
      						</div>
      						<div>
      							<label class="llabel-success">学号为13820512注册成功！</label>
      						</div>
      					</div>
      				</div>
      		</div>
      		</div>
      		<div class="col-sm-3" ><!--分割线的设计-->
      			<!--内容开始-->
      			<div class="widget-box">
      				<div class="widget-header ">
      					<h4>班级注册</h4>
      				</div>   
      				<div class="widget-body">
      					<div class="widget-main">
      						<div class="clearfix">
      							<label>请输入班级号码</label><br>
      							<input type="text" name="classnum" class="form"/>
      							<div class="btn-new-al left">
      								<button type="button" class="btn btn-sm btn-success">提交
										<i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
									</button>
								</div>
      						</div>
      						<div>
      							<label class="llabel-success">班级为1382051的所以学生注册成功！</label>
      						</div>
      					</div>
      				</div>
      			</div>
      		</div>
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
    <!-- inline scripts related to this page -->
	
	<script type="text/javascript" src="js/bootstrap.min.js" ></script>
	<!-- page specific plugin scripts -->
	<!--日期选择 -->
	<script type="text/javascript" src="js/date-time/bootstrap-datepicker.min.js" ></script>
	<script type="text/javascript" src="js/date-time/bootstrap-timepicker.min.js" ></script>
	<script type="text/javascript" src="js/date-time/moment.min.js" ></script>
	<script type="text/javascript" src="js/date-time/daterangepicker.min.js" ></script>
	<script type="text/javascript" src="js/date-time/bootstrap-datetimepicker.min.js" ></script>
	
	
	
	<script type="text/javascript" src="js/ace-elements.min.js" ></script>
  	<script type="text/javascript" src="js/ace.min.js" ></script>
  	<!-- inline scripts related to this page -->
  	<link rel="stylesheet" href="css/ace.onpage-help.css" />
    <link rel="stylesheet" href="css/themes/sunburst.css" />
  	
  </body>
</html>
