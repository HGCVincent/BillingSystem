<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"> 
  <head>
      <title>Sign in</title>
	  <link rel="stylesheet" href="../Bootstrap/bootstrap.min.css"/>
	  <link rel="stylesheet" href="../Bootstrap/css/tempusdominus-bootstrap-4.min.css"/>
	  <link rel="stylesheet" href="../css/common.css"/>
	  <script type="text/javascript" src='../Bootstrap/js/moment.js'></script>
	  <script type="text/javascript" src='../js/jquery/jquery-3.3.1.min.js'></script>
	  <script type="text/javascript" src='../Bootstrap/bootstrap.min.js'></script>
	  <script type="text/javascript" src='../Bootstrap/js/tempusdominus-bootstrap-4.min.js'></script>
  </head>
  
  <body>
		<img src="../img/LOGO.png"/>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<button class="navbar-toggler" type="button" data-toggle="collapse" 
			        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
							aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
      
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							客户信息管理
						</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="./custProfile.faces">客户基本信息</a>
							<a class="dropdown-item" href="#">客户银行账号信息</a>
						</div>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="./issuingParty.jsp">开票单位管理</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">发票信息管理</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">系统账单管理</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">税务账单管理</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">付款进度管理</a>
					</li>
				</ul>
			</div>
		</nav>
		<div id="content">
		    <f:view>
	            <h:form id="form">
	                <ui:insert name="content">Content</ui:insert>
	            </h:form>
            </f:view>
        </div>
  </body>
</html>