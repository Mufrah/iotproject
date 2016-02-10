<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <meta charset="utf-8">
    <title>State of Art Internet of Things</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="This website is a plateform for providing detail information about different Inernet of things works.">
    <meta name="author" content="Mufrah Naveed">

    <!-- The styles -->
<!--     <link id="bs-css" href="charisma/css/bootstrap-cerulean.min.css" rel='stylesheet'>
 -->
    <link href="charisma/css/bootstrap-cerulean.min.css" rel='stylesheet'>
    <link href="charisma/css/charisma-app.css" rel="stylesheet">
    <link href='charisma/bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='charisma/bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='charisma/bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='charisma/bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='charisma/bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='charisma/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='charisma/css/jquery.noty.css' rel='stylesheet'>
    <link href='charisma/css/noty_theme_default.css' rel='stylesheet'>
    <link href='charisma/css/elfinder.min.css' rel='stylesheet'>
    <link href='charisma/css/elfinder.theme.css' rel='stylesheet'>
    <link href='charisma/css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='charisma/css/uploadify.css' rel='stylesheet'>
    <link href='charisma/css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="charisma/bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="charisma/img/iot.png">

</head>

<body>
    <!-- topbar starts -->
    <div class="navbar navbar-default" role="navigation">

        <div class="navbar-inner">
            <button type="button" class="navbar-toggle pull-left animated flip">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

			<a class="navbar-brand" href="<c:url value="/"/>">
             <img alt="Charisma Logo" src="charisma/img/iot.png" class="hidden-xs"/>
                <span> Internet of Things</span>
            </a>

           
        </div>
    </div>
    <!-- topbar ends -->
<div class="ch-container">
    <div class="row">
        
        <!-- left menu starts -->
        <div class="col-sm-2 col-lg-2">
            <div class="sidebar-nav">
                <div class="nav-canvas">
                    <div class="nav-sm nav nav-stacked">

                    </div>
                    <ul class="nav nav-pills nav-stacked main-menu">
                        <li class="nav-header">IoT Categories</li>
                       	<li class="accordion">
                            <a href="#"><i class="glyphicon glyphicon-plus"></i><span> Research Venues</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href=" <c:url value="/journal" /> ">Journals</a></li>
                                <li><a href=" <c:url value="/conference" /> ">Conferences</a></li>
                                <li><a href=" <c:url value="/researchgroup" /> ">research Groups</a></li>
                               
                            </ul>
                        </li>
                        
                        <li class="accordion">
                            <a href="#"><i class="glyphicon glyphicon-plus"></i><span> IOT S&P </span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href=" <c:url value="/standard" /> "> Standards</a></li>
                                <li><a href=" <c:url value="/protocol" /> ">Protocols</a></li>
                               
                            </ul>
                        </li>
                      
					   <li><a class="ajax-link" href=" <c:url value="/rfc" /> ">
									<i class="glyphicon glyphicon-star"></i>
										<span> RFCs</span>
								</a>
						</li>
                    	
					   <li><a class="ajax-link" href=" <c:url value="/book" /> ">
									<i class="glyphicon glyphicon-star"></i>
										<span> Books</span>
								</a>
						</li>
                    	<li><a class="ajax-link" href=" <c:url value="/topuniversities" /> ">
									<i class="glyphicon glyphicon-star"></i>
										<span> Top Universities</span>
								</a>
						</li>
                      
                    </ul>
                  <!--   <label id="for-is-ajax" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label> -->
                </div>
            </div>
            
            
            
            
            
            <div class="sidebar-nav" style="margin-top: 10%;">
                <div class="nav-canvas">
                    <div class="nav-sm nav nav-stacked">

                    </div>
                    <ul class="nav nav-pills nav-stacked main-menu">
                        <li class="nav-header">Dr. Shahzad Sarwar</li>
                       	<li >
  							<img class="imageid" src="charisma/img/dr.shahzad.png" style="width:100%; height:100%;">                          
 						</li>
                     </ul>
                  <!--   <label id="for-is-ajax" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label> -->
                </div>
            </div>
       
            
            
            
            
        </div>
        <!--/span-->
        <!-- left menu ends -->

        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
         <div>
  
</div>

<div class="row">
    <div class="box col-md-12" style="margin-top: 0px;">
        <div class="box-inner">
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-info-sign"></i> Internet of Things</h2>

                <div class="box-icon">
                 
                    <a href="#" class="btn btn-minimize btn-round btn-default"><i
                            class="glyphicon glyphicon-chevron-up"></i></a>
                    
                </div>
            </div>
            <div class="box-content row">
                <div class="col-lg-7 col-md-12" >
                    <h1>Internet of Things <br>
                    </h1>
                   	 <p style="text-align: justify;" > The Internet of Things (IoT) is the network of physical objects, devices, vehicles, buildings and other items which are embedded with electronics, software, sensors, and network connectivity, which enables these objects to collect and exchange data.Being a computer science student it is important for us to know that what is important for our society? What problems we are facing? And how actually we can solved them by applying systematic scientific methods. Internet of things fields is an emerging field and helping individuals, business and society on daily basis. For taking its advantages the first need is to identify the problem. Which basically is done by some research communities. Like research venues, research groups and research centers. A formal education is require to identify such problems and how to apply them and how to communicate them. Here we have tried to highlight the state of art work done by all different venues. Which problems they are solvings using internet of thing concept. </p>
                </div>
                
                <div class="col-lg-5 col-md-12 hidden-xs center-text">
	            	<img alt="Charisma Logo" src="charisma/img/iot2.png" class="hidden-xs" style="width: 80%; margin-top: 17%;"/>
				</div>
				
				<div class="col-lg-12 col-md-12" >
                              	 <p style="text-align: justify;" > The Internet of Things (IoT) is the network of physical objects, devices, vehicles, buildings and other items which are embedded with electronics, software, sensors, and network connectivity, which enables these objects to collect and exchange data.Being a computer science student it is important for us to know that what is important for our society? What problems we are facing? And how actually we can solved them by applying systematic scientific methods. Internet of things fields is an emerging field and helping individuals, business and society on daily basis. For taking its advantages the first need is to identify the problem. Which basically is done by some research communities. Like research venues, research groups and research centers. A formal education is require to identify such problems and how to apply them and how to communicate them. Here we have tried to highlight the state of art work done by all different venues. Which problems they are solvings using internet of thing concept.<br>Besides the plethora of new application areas for Internet connected automation to expand into, IoT is also expected to generate large amounts of data from diverse locations that is aggregated very quickly, thereby increasing the need to better index, store and process such data. </p>
                </div>
                
                
            <div class="col-lg-5 col-md-12 hidden-xs center-text">
            
            
            </div>
               
            </div>
            
            
            
        </div>
    </div>
</div>

    <!-- content ends -->
    </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->

    <!-- Ad, you can remove it -->
    <div class="row">
      
	
    </div>
    <!-- Ad ends -->

    <hr>

<!-------------------------TEACHER MODEL ----------------------- -->

<div class="modal fade" id="viewteacherdetail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">


        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h4>Assistant Professor Dr. Shahzad Sarwar</h4>
                </div>
                <div class="modal-body">
              	
              		 <table class="table table-striped table-bordered responsive">
                       

                        <tr>
                            <td><img class="imageid" src="charisma/img/dr.shahzad.png" style="width:100%; height:40%;">    </td>
                            <td class="center">
							 	Dr.Shahzad Sarwar is teaching Internet of Things course in PUCIT. His qualification detaila are listed below:
								<br>
							 	<ul>
									<li>PhD Electrical Engineering and IT, Vienna University of Technology Austria, 2008</li>
									<li>MS Computer Science, LUMS Lahore, 2004</li>
									<li>B.Sc Civil Engineering, UET Taxila, 1998</li>
									<li>Computer Networks, Topics in Internet Research, Optical Communications, Performance Modeling</li>
									<li> Email: <a href="mailto:S.sarwar@pucit.edu.pk">S.sarwar@pucit.edu.pk</a></li>
								
								</ul>                     
							</td>
							                          
                        </tr>
                   </tbody>
                   </table>
                   
                
                </div>
                <div class="modal-footer">
                    <a href="#" class="btn btn-default" data-dismiss="modal">Close</a>
             	</div>
            </div>
        </div>

</div>
		
<!-- ---------------------------------------------------------------------------------------------- -->

    <footer class="row">
        <p class="col-md-9 col-sm-9 col-xs-12 copyright">&copy; <a href="http://pucit.edu.pk/" target="_blank">
                IOT</a> 2015 - 2016</p>

        <p class="col-md-3 col-sm-3 col-xs-12 powered-by">Powered by: <a
                href="http://pucit.edu.pk/">PUCIT</a></p>
    </footer>

</div><!--/.fluid-container-->

<!-- external javascript -->

<%-- <script src="<c:url value="charisma/js/jquery-1.7.2.min.js"/>"></script>
<!-- jQuery UI -->
<script src="<c:url value="charisma/js/jquery-ui-1.8.21.custom.min.js"/>"></script>
<!-- modal / dialog library -->
<script src="<c:url value="charisma/bower_components/js/bootstrap/modal.js"/>"></script>
 --%>

<script src="charisma/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="charisma/js/global.js"></script>
<!-- library for cookie management -->
<script src="charisma/js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='charisma/bower_components/moment/min/moment.min.js'></script>
<script src='charisma/bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='charisma/js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="charisma/bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="charisma/bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="charisma/js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="charisma/bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="charisma/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="charisma/js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="charisma/js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="charisma/js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="charisma/js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="charisma/js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="charisma/js/charisma.js"></script>


</body>
</html>
