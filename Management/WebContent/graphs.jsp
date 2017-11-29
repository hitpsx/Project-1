<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>统计</title>
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
<script src="js/Chart.js"></script>
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
                        <a href="graphs.html" class=" hvr-bounce-to-right"> <i class="fa fa-area-chart nav_icon"></i>Graphs</a>
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
				<a href="index.html">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Graphs</span>
				</h2>
		    </div>
		<!--//banner-->
	
 	<!--//grid-->
 	<div class="graph">
	<div class="col-md-12 graph-box1 clearfix">	
							<div class="grid-1">
								<h4>Pie</h4>
								<div class="grid-graph">
									<div class="grid-graph1">
								    <div id="os-Mac-lbl">Switch <span>10%</span></div>
									<div id="os-Other-lbl">Server<span>30%</span></div>
									<div id="os-test-lbl">Router<span>10%</span></div>
									<div id="os-test1-lbl">Office equipment<span> 50%</span></div> 
								    
								 </div>
								 </div>
							<div class="grid-2">
								<canvas id="pie" height="315" width="470" style="width: 470px; height: 315px;"></canvas>
								<script>
									var pieData = [
										{
											value: 10,
											color:"#3BB2D0"
										},
										{
											value : 30,
											color : "#D95459"
										},
										{
											value : 10,
											color : "#17202A"
										},
										{
											value : 30,
											color : "#F1C40F"
										}
									];
									new Chart(document.getElementById("pie").getContext("2d")).Pie(pieData);
								</script>
							</div>
							<div class="clearfix"> </div>
						</div>
						
					</div>	
<!------------------------------------->
				
					<div class="graph-box">
						<div class="col-md-4 graph-3">
							<div class="grid-1 grid-on">
								<h4>PolarArea</h4>
								<canvas id="polarArea" height="300" width="300" style="width: 300px; height: 300px;"></canvas>
								<script>
									var chartData = [
										{
											value : Math.random(),
											color: "#1ABC9C"
										},
										{
											value : Math.random(),
											color: "#C7604C"
										},
										{
											value : Math.random(),
											color: "#21323D"
										},
										{
											value : Math.random(),
											color: "#50667f"
										},
										{
											value : Math.random(),
											color: "#7D4F6D"
										},
										{
											value : Math.random(),
											color: "#8a8acb"
										}
									];
									new Chart(document.getElementById("polarArea").getContext("2d")).PolarArea(chartData);
								</script>
							</div>
						</div>
							<div class="col-md-4 graph-4 ">
							<div class="grid-1 grid-on">
								<h4>Radar</h4>
								<canvas id="radar" height="300" width="300" style="width: 300px; height: 300px;"></canvas>
									<script>
										var radarChartData = {
											labels : ["","","","","","",""],
											datasets : [
												{
													fillColor : "#D95459",
													strokeColor : "#D95459",
													pointColor : "#D95459",
													pointStrokeColor : "#fff",
													data : [65,59,90,81,56,55,40]
												},
												{
													fillColor : "#1ABC9C",
													strokeColor : "#1ABC9C",
													pointColor : "#1ABC9C",
													pointStrokeColor : "#fff",
													data : [28,48,40,19,96,27,100]
												}
											]
											
										};
										new Chart(document.getElementById("radar").getContext("2d")).Radar(radarChartData);
									</script>
								</div>
						</div>
						<div class="col-md-4 graph-5">
							<div class="grid-1 grid-on">
								<h4>Circular</h4>
								<canvas id="doughnut" height="300" width="300" style="width: 300px; height: 300px;"></canvas>
								<script>
									var doughnutData = [
									{
										value: 30,
										color:"#D95459"
									},
									{
										value : 50,
										color : "#FBB03B"
									},
									{
										value : 100,
										color : "#3BB2D0"
									},
									{
										value : 40,
										color : "#8a8acb"
									},
									];
									new Chart(document.getElementById("doughnut").getContext("2d")).Doughnut(doughnutData);
								</script>
							</div>
						</div>
					
						
						<div class="clearfix"> </div>
					</div>				
				</div>
				
		<!---->
		<div class="copy">
            <p> &copy; 2016 Minimal. All Rights Reserved | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>	    </div>
		</div>
		</div>
		<div class="clearfix"> </div>
       </div>
  
<!---->

<script src="js/bootstrap.min.js"> </script>
  
  
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
			

			
		});
		</script>

<!----->

<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
</body>
</html>
