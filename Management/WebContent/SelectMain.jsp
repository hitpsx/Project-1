<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Select Result</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Home Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!--<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />-->
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
		font-family: verdana,arial,sans-serif;
		font-size:11px;
		color:#333333;
		border-width: 1px;
		border-color: #999999;
		border-collapse: collapse;
	}
	table.hovertable th {
		background-color:#c3dde0;
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #a9c6c9;
	}
	table.hovertable tr {
		background-color:#d4e3e5;
	}
	table.hovertable td {
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #a9c6c9;
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
                        <s:a action="SelectHome"><s:param name="userid"> <s:property value="user.userid"/> </s:param><i class="fa fa-picture-o nav_icon"></i> <span class="nav-label">Equipment Manage</span></s:a>
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
				<span>Equipment  information</span>
				</h2>
		    </div>
		<!--//banner-->
 	 <!--faq-->
 	<div class="blank">
		 	<form class="form" action="CsSelect" method="post">
		                <div class="input-group input-group-in">
		                    <input type="text" name="EquName" class="form-control2 input-search" placeholder="Search...">
		                    <input type="hidden" name=userid value=<s:property value="user.userid"/> />
		                    <span class="input-group-btn">
		                        <button class="btn btn-success" type="submit"><i class="fa fa-search"></i></button>
		                    </span>
		                </div><!-- Input Group -->
		     </form>

			<div class="blank-page">
			
			<form class="form" action="" method="post">
				<input type="hidden" name=userid value=<s:property value="user.userid"/> />
				 <table class="hovertable">
					<tr>
						<th>Manage</th>
						<th>EquNumber</th>
						<th>EquName</th>
						
						<th>ModelSpe</th>
						<th>EquDate</th>
						
						<th>Sta</th>
						<th>EquUnit</th>
						
						<th>Equclass</th>
						<th>Manufacturer</th>
						
						<th>Supplier</th>
						<th>Specifications</th>
						
						<th>OrderDate</th>
						<th>Inspector</th>
						<th>Quality</th>
						
						<th>MaintenanceDate</th>
						<th>Maintainer</th>
						
						<th>InventoryPosition</th>
						<th>PresentPosition</th>
						<th>UnitPrice</th>
						<th>TotalPrice</th>
						
						<th>Batch</th>
						<th>Lender</th>
						
					</tr>
					<s:iterator value="Cp" var="Lend">
					<tr onmouseover="this.style.backgroundColor='#F0F8FF';" onmouseout="this.style.backgroundColor='#d4e3e5';">
						<td>
						    <a href="RetirButton?userid=<s:property value="user.userid"/>&EquNumber=<s:property value="#Lend.EquNumber"/>">Delete</a>
						    <a href="LendButton?userid=<s:property value="user.userid"/>&EquNumber=<s:property value="#Lend.EquNumber"/>">Lend</a>
						    <a href="CsUpdate?userid=<s:property value="user.userid"/>&EquNumber=<s:property value="#Lend.EquNumber"/>">Update</a>
						    
						</td>
						<td><s:property value="#Lend.EquNumber"/></td>
						<td><s:property value="#Lend.EquName"/></td>
						
						<td><s:property value="#Lend.ModelSpe"/></td>
						<td><s:property value="#Lend.EquDate"/></td>						
						<td><s:property value="#Lend.EquSta"/></td>
						
						<td><s:property value="#Lend.EquUnit"/></td>
						<td><s:property value="#Lend.EquClass"/></td>
						<td><s:property value="#Lend.Manufacturer"/></td>
						
						<td><s:property value="#Lend.Supplier"/></td>
						<td><s:property value="#Lend.Specifications"/></td>						
						<td><s:property value="#Lend.OrderDate"/></td>
						
						<td><s:property value="#Lend.Inspector"/></td>
						<td><s:property value="#Lend.Quality"/></td>						
						<td><s:property value="#Lend.MaintenanceDate"/></td>
						
						<td><s:property value="#Lend.Maintainer"/></td>
						<td><s:property value="#Lend.InventoryPosition"/></td>						
						<td><s:property value="#Lend.PresentPosition"/></td>
						
						<td><s:property value="#Lend.UnitPrice"/></td>
						<td><s:property value="#Lend.TotalPrice"/></td>						
						<td><s:property value="#Lend.Batch"/></td>
						
						<td><s:property value="#Lend.Lender"/></td>
					</tr>
					</s:iterator>

					</table>
			</form>
	        </div>
        	<ul class="pagination">
			    <li><a href="EquManage?userid=<s:property value="user.userid"/>&page=0">&laquo;</a></li>
			     <% for(int i=0;i<10;i++){ %>
			       <li><a href="EquManage?userid=<s:property value="user.userid"/>&page=<%=i%>"><%=i%></a></li>
			    <%}%>
			    <li><a href="#">&raquo;</a></li>
			</ul> 				
	       </div>
	</div>
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

