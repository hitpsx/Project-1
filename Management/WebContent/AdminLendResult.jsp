<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Lend</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">
<script src="js/jquery.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>

<!-- Mainly scripts -->
<script src="js/jquery.metisMenu.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<style type="text/css">
table.hovertable {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #ffffff;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
}

table.hovertable th {
	background-color: #5182bb;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #5182bb;
	font-size: 11px;
	color: #FFFFFF;
}

table.hovertable tr {
	background-color: #ffffff;
	border-width: 1px;
	border-style: solid;
	border-color: #5182bb;
	font-size: 11px;
	color: #ffffff;
}

table.hovertable td {
	border-width: 0px;
	padding: 8px;
	border-style: solid;
	border-color: #5182bb;
	color: #333333;
}

.blank1 {
	float: right;
	width: 35%;
	height: 23px
}

.blank2 {
	float: right;
	width: 150px;
	height: 23px
}

.unread {
	float: right;
	width: 75px;
	height: 23px
}

.readed {
	float: right;
	width: 75px;
	height: 23px
}

.pagination_1 {
	display: inline-block;
	padding-left: 18%;
	margin: 20px 0;
	border-radius: 4px;
}

.pagination_1>li {
	display: inline;
}

.pagination_1>li {
	display: inline;
}

* {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

* {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

li {
	display: list-item;
	text-align: -webkit-match-parent;
}

.pagination_1>li>a, .pagination_1>li>span {
	position: relative;
	float: left;
	padding: 6px 12px;
	margin-left: -1px;
	line-height: 1.42857143;
	color: #337ab7;
	text-decoration: none;
	background-color: #fff;
	border: 1px solid #ddd;
}
</style>
<!-- Custom and plugin javascript -->
<link href="css/custom.css" rel="stylesheet">
<script src="js/custom.js"></script>
<script src="js/screenfull.js"></script>
<script>
		$(function () {
			$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

			if (!screenfull.enabled) {
				return false;
			}

			

			$('#toggle').click(function () {
				screenfull.toggle($('#container')[0]);
			});
			

			
		});
		</script>
</head>
<body>
	<div id="wrapper">
		<!----->
		<nav class="navbar-default navbar-static-top" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<h1>
					<a class="navbar-brand"
						href="Home?userid=<s:property value="user.userid"/>">Home</a>
				</h1>
			</div>
			<div class=" border-bottom">
				<div class="full-left">
					<script type="text/javascript">  
        	  function startTime(){  
				  var today=new Date()  
				  var week=new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
				  var monthh=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
				  var month=today.getMonth()+1  
				  var date=today.getDate()  
				  var day=today.getDay()  
				  var h=today.getHours()  
				  var m=today.getMinutes()  
				  var s=today.getSeconds()  
				  // add a zero in front of numbers<10  
				  h=checkTime(h)  
				  m=checkTime(m)  
				  s=checkTime(s)  
				  document.getElementById('time').innerHTML=monthh[month-1]+" "+date+"th "+week[day]+"  "+h+":"+m+":"+s+" "  
				  t=setTimeout('startTime()',500)  
				 }  
					  
					 function checkTime(i){  
					 if (i<10)   
					   {i="0" + i}  
					   return i  
					 }  
				</script>
					<body onload="startTime()">
						<div id="time"></div>
				</div>
			</div>


			<!-- Brand and toggle get grouped for better mobile display -->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="drop-men">
				<ul class=" nav_1">
					<li class="dropdown"><a href="#"
						class="dropdown-toggle dropdown-at" data-toggle="dropdown"><span
							class=" name-caret"><s:property value="user.username" /><i
								class="caret"></i></span><img src="<s:property value="user.picture"/>"></a>
						<ul class="dropdown-menu " role="menu">
							<li><s:a action="Profile">
									<s:param name="userid">
										<s:property value="user.userid" />
									</s:param>
									<i class="fa fa-user"></i>Profile</s:a></li>
							<li><a href="calendar.html"><i class="fa fa-calendar"></i>Calender</a></li>
						</ul></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
			<div class="clearfix"></div>

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li><a href="#" class=" hvr-bounce-to-right"><i
								class="fa fa-indent nav_icon"></i> <span class="nav-label">Equipment
									Class</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="404.html" class=" hvr-bounce-to-right"> <i
										class="fa fa-area-chart nav_icon"></i>2017<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Micro-Computer"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Switch"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Switch</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Server"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Server</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=ORouter"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Router</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Office equipment"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
									</ul></li>
								<li><a href="404.html" class=" hvr-bounce-to-right"><i
										class="fa fa-area-chart nav_icon"></i>2016<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Micro-Computer"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Switch"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Switch</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Server"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Server</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=ORouter"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Router</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Office equipment"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
									</ul></li>

								<li><a href="404.html" class=" hvr-bounce-to-right"><i
										class="fa fa-area-chart nav_icon"></i>2015<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Micro-Computer"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Switch"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Switch</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Server"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Server</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=ORouter"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Router</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Office equipment"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
									</ul></li>

								<li><a href="404.html" class=" hvr-bounce-to-right"> <i
										class="fa fa-area-chart nav_icon"></i>2014<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Micro-Computer"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Switch"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Switch</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Server"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Server</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=ORouter"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Router</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Office equipment"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
									</ul></li>

								<li><a href="404.html" class=" hvr-bounce-to-right"><i
										class="fa fa-area-chart nav_icon"></i>2013<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Micro-Computer"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Switch"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Switch</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Server"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Server</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=ORouter"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Router</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Office equipment"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
									</ul></li>

								<li><a href="404.html" class=" hvr-bounce-to-right"><i
										class="fa fa-area-chart nav_icon"></i>2012<span
										class="fa arrow"></span></a>
									<ul class="nav nav-second-level">
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Micro-Computer"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Switch"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Switch</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Server"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Server</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=ORouter"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Router</a></li>
										<li><a
											href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Office equipment"
											class=" hvr-bounce-to-right"><i
												class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
									</ul></li>

							</ul></li>
						<li><s:a action="HomeSelect">
								<s:param name="userid">
									<s:property value="user.userid" />
								</s:param>
								<i class="fa fa-inbox nav_icon"></i>
								<span class="nav-label">Select</span>
							</s:a></li>

						<li><a href="#" class=" hvr-bounce-to-right"><i
								class="fa fa-list nav_icon"></i> <span class="nav-label">Management</span><span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><s:a action="SelectHome">
										<s:param name="userid">
											<s:property value="user.userid" />
										</s:param>
										<i class="fa fa-picture-o nav_icon"></i>
										<span class="nav-label">Find</span>
									</s:a></li>
								<li><a
									href="HomeRepair?userid=<s:property value="user.userid"/>"
									class=" hvr-bounce-to-right"><i
										class="fa fa-check-square-o nav_icon"></i>Repair</a></li>
								<li><a
									href="HomeAdd?userid=<s:property value="user.userid"/>"
									class=" hvr-bounce-to-right"><i
										class="fa fa-check-square-o nav_icon"></i>Add</a></li>

							</ul></li>
						<li><a href="#" class=" hvr-bounce-to-right"><i
								class="fa fa-list nav_icon"></i> <span class="nav-label">Lend
									Management</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><s:a action="HomeLend">
										<s:param name="userid">
											<s:property value="user.userid" />
										</s:param>
										<i class="fa fa-align-left nav_icon"></i>
										<span class="nav-label">Lend out</span>
									</s:a></li>
								<li><a
									href="HomeLendin?userid=<s:property value="user.userid"/>&page=0"
									class=" hvr-bounce-to-right"><i
										class="fa fa-check-square-o nav_icon"></i>Lend in</a></li>
							</ul></li>

						<li><s:a action="HomeRetire">
								<s:param name="userid">
									<s:property value="user.userid" />
								</s:param>
								<i class="fa fa-th nav_icon"></i>
								<span class="nav-label">Retirement</span>
							</s:a></li>

						<li><a href="graph?userid=<s:property value="user.userid"/>"
							class=" hvr-bounce-to-right"> <i
								class="fa fa-area-chart nav_icon"></i>Graphs
						</a></li>

						<li><a href="#" class=" hvr-bounce-to-right"><i
								class="fa fa-cog nav_icon"></i> <span class="nav-label">Settings</span><span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="login.html" class=" hvr-bounce-to-right"><i
										class="fa fa-sign-in nav_icon"></i>Signin</a></li>
								<li><a href="registration.html"
									class=" hvr-bounce-to-right"><i
										class="fa fa-sign-in nav_icon"></i>Singup</a></li>
								<li><a
									href="AdminInvite?userid=<s:property value="user.userid"/>"
									class=" hvr-bounce-to-right"><i
										class="fa fa-sign-in nav_icon"></i>Invite Manage</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="content-main">

				<!--banner-->
				<div class="banner">
					<h2>
						<a href="Home?userid=<s:property value="user.userid"/>">Home</a> <i
							class="fa fa-angle-right"></i> <span>Lend information</span>
					</h2>
				</div>
				<!--//banner-->
				<!--faq-->
				<div class="blank">


					<div class="blank-page">
						<form class="form" action="" method="post">
							<div class="blank1"></div>
							<div class="readed">
								<a
									href="AdminRead?userid=<s:property value="user.userid"/>&type=10"><b>Readed</b></a>
							</div>
							<div class="blank2"></div>
							<div class="unread">
								<a
									href="AdminRead?userid=<s:property value="user.userid"/>&type=11"><b>Unread</b></a>
							</div>
							<input type="hidden" name=userid
								value=<s:property value="user.userid"/> />
							<table class="hovertable">
								<tr>
									<th>EquID</th>
									<th>Title</th>
									<th>EquName</th>
									<th>LendUnit</th>
									<th>UnitLend</th>
									<th>Applicant</th>
									<th>ApplicationDate1</th>
									<th>ApplicationDate2</th>
									<th>Sta</th>
									<th>Countdown</th>
									<th>Manage</th>
								</tr>
								<s:iterator value="lend" var="Lend">
									<tr onmouseover="this.style.backgroundColor='#fdf5e6';"
										onmouseout="this.style.backgroundColor='#ffffff';">
										<td><s:property value="#Lend.LendNumber" /></td>
										<td><s:property value="#Lend.maintext" /></td>
										<td><a
											href="EquInformation?userid=<s:property value="user.userid"/>&EquNumber=<s:property value="#Lend.LendNumber"/>"><s:property
													value="#Lend.EquName" /></a></td>
										<td><s:property value="#Lend.LendUnit" /></td>
										<td><s:property value="#Lend.UnitLend" /></td>
										<td><s:property value="#Lend.Applicant" /></td>
										<td><s:property value="#Lend.ApplicationDate1" /></td>
										<td><s:property value="#Lend.ApplicationDate2" /></td>
										<td><s:property value="#Lend.Sta" /></td>
										<td><s:property value="#Lend.Countdown" /></td>
										<td><s:a
												href="view?userid=%{user.userid}&EquNumber=%{#Lend.LendNumber}&type=%{1}">View</s:a></td>

									</tr>
								</s:iterator>
							</table>
						</form>
						<ul class="pagination_1">
							<li><a
								href="HomeLend?userid=<s:property value="user.userid"/>&page=0">&laquo;</a></li>
							<% for(int i=0;i<10;i++){ %>
							<li><a
								href="HomeLend?userid=<s:property value="user.userid"/>&page=<%=i%>"><%=i%></a></li>
							<%}%>
							<li><a
								href="HomeLend?userid=<s:property value="user.userid"/>&page=9">&raquo;</a></li>
						</ul>
					</div>
				</div>

				<!--//faq-->
				<!---->

				<!---->
				<!--scrolling js-->
				<script src="js/jquery.nicescroll.js"></script>
				<script src="js/scripts.js"></script>
				<!--//scrolling js-->
</body>
</html>

