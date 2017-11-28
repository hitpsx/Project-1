<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Lend</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<script src="js/jquery.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>
<link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
<script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<!-- Mainly scripts -->
<script src="js/jquery.metisMenu.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
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
			$( "#datepicker" ).datepicker();
			
		});
		</script>



</head>
<body>
<div id="wrapper">
       <!----->
        <nav class="navbar-default navbar-static-top" role="navigation">
             <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               <h1> <a class="navbar-brand" href="Home?userid=<s:property value="user.userid"/>">Home</a></h1>   
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
				  document.getElementById('time').innerHTML=monthh[month]+" "+date+"th "+week[day]+"  "+h+":"+m+":"+s+" "  
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
		    <div class="drop-men" >
		        <ul class=" nav_1">	     
					<li class="dropdown">
		              <a href="#" class="dropdown-toggle dropdown-at" data-toggle="dropdown"><span class=" name-caret"><s:property value="user.username"/><i class="caret"></i></span><img src="images/wo.jpg"></a>
		              <ul class="dropdown-menu " role="menu">
		              <li><s:a action="UserSelect"><s:param name="userid"> <s:property value="user.userid"/> </s:param><i class="fa fa-user"></i>Profile</s:a></li>
		                <li><a href="calendar.html"><i class="fa fa-calendar"></i>Calender</a></li>
		              </ul>
		            </li>
		           
		        </ul>
		     </div><!-- /.navbar-collapse -->
			<div class="clearfix">
       
     </div>
	  
		    <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">			                           
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-indent nav_icon"></i> <span class="nav-label">Equipment Class</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="404.html" class=" hvr-bounce-to-right"> <i class="fa fa-area-chart nav_icon"></i>2017<span class="fa arrow"></span></a>
	                            <ul class="nav nav-second-level">
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Micro-Computer" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Switch" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Switch</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Server" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Server</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=ORouter" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Router</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2017&EquClass=Office equipment" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
	                            </ul>
                            </li>
                            <li><a href="404.html" class=" hvr-bounce-to-right"><i class="fa fa-area-chart nav_icon"></i>2016<span class="fa arrow"></span></a>
                             <ul class="nav nav-second-level">
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Micro-Computer" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Switch" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Switch</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Server" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Server</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=ORouter" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Router</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2016&EquClass=Office equipment" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
	                         </ul>
                            </li>
			
							<li><a href="404.html" class=" hvr-bounce-to-right"><i class="fa fa-area-chart nav_icon"></i>2015<span class="fa arrow"></span></a>
							 <ul class="nav nav-second-level">
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Micro-Computer" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Switch" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Switch</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Server" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Server</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=ORouter" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Router</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2015&EquClass=Office equipment" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
	                         </ul>
							</li>
							
							<li><a href="404.html" class=" hvr-bounce-to-right"> <i class="fa fa-area-chart nav_icon"></i>2014<span class="fa arrow"></span></a>
							 <ul class="nav nav-second-level">
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Micro-Computer" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Switch" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Switch</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Server" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Server</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=ORouter" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Router</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2014&EquClass=Office equipment" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
	                         </ul>
							</li>
                            
                            <li><a href="404.html" class=" hvr-bounce-to-right"><i class="fa fa-area-chart nav_icon"></i>2013<span class="fa arrow"></span></a>
                             <ul class="nav nav-second-level">
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Micro-Computer" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Switch" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Switch</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Server" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Server</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=ORouter" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Router</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2013&EquClass=Office equipment" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
	                         </ul>
                            </li>
			
							<li><a href="404.html" class=" hvr-bounce-to-right"><i class="fa fa-area-chart nav_icon"></i>2012<span class="fa arrow"></span></a>
							 <ul class="nav nav-second-level">
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Micro-Computer" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Micro-Computer</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Switch" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Switch</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Server" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Server</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=ORouter" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Router</a></li>
	                                   <li><a href="ComputerHome?userid=<s:property value="user.userid"/>&year=2012&EquClass=Office equipment" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>Office equipment</a></li>
	                         </ul>
							</li>

					   </ul>
                    </li>
					<li>
					    <s:a action="EquManage"><s:param name="userid"> <s:property value="user.userid"/> </s:param><i class="fa fa-inbox nav_icon"></i> <span class="nav-label">Select</span></s:a>
					 
                    </li>
                    
                    <li>
                        <s:a action="SelectHome"><s:param name="userid"> <s:property value="user.userid"/> </s:param><i class="fa fa-picture-o nav_icon"></i> <span class="nav-label">EquManage</span></s:a>
                    </li>
                             
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-list nav_icon"></i> <span class="nav-label">Lend Management</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li> <s:a action="Lendinfor"><s:param name="userid"> <s:property value="user.userid"/> </s:param><i class="fa fa-align-left nav_icon"></i> <span class="nav-label">Lend out</span></s:a></li>
                            <li><a href="404.html" class=" hvr-bounce-to-right"><i class="fa fa-check-square-o nav_icon"></i>Lend in</a></li>
                        </ul>
                    </li>
                    
                     <li>
                        <s:a action="Retire"><s:param name="userid"> <s:property value="user.userid"/> </s:param><i class="fa fa-th nav_icon"></i> <span class="nav-label">Retirement</span></s:a>
                    </li>
                    
                   
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-cog nav_icon"></i> <span class="nav-label">Settings</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="index.html" class=" hvr-bounce-to-right"><i class="fa fa-sign-in nav_icon"></i>Signin</a></li>
                            <li><a href="registration.html" class=" hvr-bounce-to-right"><i class="fa fa-sign-in nav_icon"></i>Singup</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
			</div>
        </nav>
		 <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		     <div class="banner">
		    	<h2>
				<a href="Home?userid=<s:property value="user.userid"/>">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Blank</span>
				</h2>
		    </div>
		<!--//banner-->
 	 <!--faq-->
 	<div class="blank">
	

			<div class="blank-page">
			<form class="form" action="LendManage" method="post">
				<input type="hidden" name=userid value=<s:property value="user.userid"/> />
				<input type="hidden" name=EquName value=<s:property value="Cp.EquName"/> />
				<input type="hidden" name=LendNumber value=<s:property value="Cp.EquNumber"/> />
				
				<br><label for="id_LendEqu">设备名称:</label><s:property value="Cp.EquName"/></br>
				<br><label for="id_Lendnumber">设备编号:</label><s:property value="Cp.EquNumber"/></br>
				
				<br><label for="id_LendUnit">所借单位:</label> <select name=LendUnit><option value = "CS">cs</option><option value = "Big Data">BigData</option><option value = "Welding">Welding</option><option value = "AI">AI</option></select></br>
				<br><label for="id_main">申请主题:</label><input type="text" name="maintext" autofocus maxlength="254" required id="id_main"/></br>
				<br><label for="id_Applicant">Applicant:</label>
				    <input type="text" name="Applicant" autofocus maxlength="254" required id="id_Applicant"/>
				</br>
				<br><label for="id_ApplicationDate">Date:</label>
					<input type="text" id="datepicker" name="ApplicationDate" required id="id_ApplicationDate">
			    </br>
				<br><textarea rows="20" cols="50" name="application" required id="id_application" placeholder="输入你的申请，这会提交给admin审核，通过后会给予信息提醒"></textarea></br>
				<br><input type="submit" value="提交" class="text-sub"></br>
			</form>
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

