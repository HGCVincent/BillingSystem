<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"> 
<head> 
<title>第一个JSF程序</title>
    <link rel="stylesheet" href="../Bootstrap/bootstrap.min.css"/>
 
    <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/interface/dwrController.js'></script>
    <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/dwr/util.js"></script>
    <script type="text/javascript">
        function f(){
            dwrController.aa(function(data){
                alert(data);
            })
        }
    </script>
    <script type="text/javascript" src='../js/jquery/jquery-3.3.1.min.js'></script>
    <script type="text/javascript" src='../Bootstrap/bootstrap.min.js'></script>
</head> 
<body> 
<f:view> 
<h:form id="form"> 
	<h3>请输入您的名称</h3> 
	名称: <input jsfc="h:inputText" value="#{user.name}" id="it"/><br/> 
	<h:commandButton value="送出" action="login"/> 
	<input type="button" value="button" onclick="f()"/>
</h:form> 
</f:view> 
</body> 
</html>  
